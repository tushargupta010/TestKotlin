import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>) {

    var printMessage = { message:String -> println(message) }
    printMessage("hello world")

    val sumA = { a:Int ,b:Int ->  a + b  }
    printMessage(sumA(5,3).toString())
    printMessage("Sum is ${sumA(5,3)}")

    val sumB : (Int, Int) -> Int = {x,y -> x+y}
    printMessage(sumB(5,9).toString())
    printMessage("Sum is ${sumB(5,9)}")

    fun downloadData(url:String, completion: () -> Unit) {
        // sent a download request
        // we got back data
        // there was no network errors
        completion()
    }

    downloadData("fakeUrl.com", { println("The code in this block, will only run after the completion") })

    // if we have last parameter is lambda then we can move lambda expression body outside function
    downloadData("fakeUrl.com") { println("The code in this block, will only run after the completion") }

    fun downloadCarData(url:String, completion: (MyCar) -> Unit) {
        // sent a download request
        // we got back car data
        val car = MyCar("Tesla", "Models", "Red")
        completion(car)
    }

    downloadCarData("fakeUrl.com") { car ->
        printMessage(car.color)
        printMessage(car.make)
    }
    // if we have only 1 parameter then we can use "it"
    downloadCarData("fakeUrl.com") {
        printMessage(it.color)
        printMessage(it.make)
    }

    fun downloadTruckData(url:String, completion: (MyTruck?,Boolean) -> Unit) {
        // sent a web request
        // we got back results data
        val webRequestSuccess = false
        if(webRequestSuccess) {
            // receive truck data
            val truck = MyTruck("Ford", "F-150", 10000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeUrl.com") { truck, success ->
        if (success) {
            // do something with our truck
            truck!!.accelerate()
        } else {
            // handle the web request failure
            println("Something went wrong")
        }

    }


}