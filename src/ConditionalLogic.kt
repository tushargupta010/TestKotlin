fun main(args: Array<String>) {

    //    ==, !=, >, <, >=, <=

    val a = 2
    val b = 3

    if(a == b) {
        println("A does in fact equal to B")
    }

    if(a != b) {
        println("A does not equal to B")
    }

    val accountBalance = 100
    val price = 150

    if(accountBalance >= price) {
        println("You can buy this")
    } else {
        println("Sorry, you broke")
    }

    val degrees = 20

    if(degrees >= 70) {
        println("This is some nice weather")
    } else if(degrees < 70 && degrees >= 50) {
        println("Grab a sweater")
    } else {
        println("Holly crap it's cold")
    }

    val isHungry = false
    val isBored = true

    if(isHungry || isBored) {
        println("Let's get pizza")
    }
    if(isHungry && isBored) {
        println("cancel the pizza")
    }

    // switch is known as when in kotlin
    val x = 3
    when(x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x does not equal to 1 or 2")
    }

    fun venderIsFeeling(mood:String = "angry") {
        if(mood == "angry") {
            println("run for the hills, Vender is $mood")
        } else {
            println("whatever you do, don\'t make him angry")
        }
    }

    venderIsFeeling("happy")
    venderIsFeeling()

}