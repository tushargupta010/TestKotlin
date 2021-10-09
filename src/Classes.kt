// var creates getter and setter
class Car(val make: String, val model: String, val color: String) {
    fun accelerate() {
        println("Vroom vroom...")
    }

    fun details() {
        println("This is a $color $make $model")
    }
}

class Truck(val make: String, val model: String, val towingCapacity: Int) {
    fun tow() {
        println("taking the horses to the radio")
    }
    fun details() {
        println("The $make $model has a towing capacity of $towingCapacity lbs")
    }
}

fun main(args: Array<String>) {
    val car = Car("Toyota", "Avalon", "Red")
    println(car.make)
    println(car.model)
    //car.make = ""
    //car.model = ""
    car.accelerate()
    car.details()

    val truck = Truck("Ford", "F-50", 10000)
    truck.tow()
    truck.details()

}