// variables :- that stores value

// mutability : whether or not can a variable be change or not
//  mutable :- variable can change value , so we used var keyword
//  immutable :- variable can not change value , so we used val keyword
//  TypeInference feature :- no need to define DataType of variable

fun main(args: Array<String>) {

    val name: String = "Johny B"
    //name = "Tushar" // val value can not be changeable
    val isAwesome: Boolean = true
    println("Is " + name + " awesome? The answer is : " + isAwesome) // java way
    println("Is $name awesome? The answer is : $isAwesome") // string template way

    val a: Int = 3
    val b: Int = 6
    println(a + b)

    val doubleNum: Double = 123.45  // 64 bit number
    val floatNum: Float = 123.45f  // 32 bit number

    val longNum = 131213545646464L  // 64 bit number

    val aDouble = a.toDouble()

    var hero:String
    hero = "Tushar"
    hero = "SuperMan"
    println(hero)

}