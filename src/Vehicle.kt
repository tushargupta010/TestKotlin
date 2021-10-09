// in kotlin all classes are final or sealed so we used open keyword for inheritance
open class Vehicle(val make:String, val model:String) {
    open fun accelerate() {
        println("Vroom vroom...")
    }

    fun park() {
        println("parking the vehicle")
    }

    fun brake() {
        println("STOP")
    }
}

class MyCar(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerate() {
        super.park()
        println("We are going ludicrous mode")
    }
}

class MyTruck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
    fun tow() {
        println("headed out to mountains")
    }
}

fun main(args: Array<String>) {
    val tesla = MyCar("Tesla", "Models", "Red")
    tesla.accelerate()

    val truck = MyTruck("Ford", "F-150", 10000)
    truck.accelerate()
    truck.tow()

}