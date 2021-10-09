fun main(args: Array<String>) {

    var name: String = "Tushar"
    //name = null

    var nullableName:String? = "Do I really exist?"
    println(nullableName)
    //println(nullableName.length) // compiler error

    // 1st method : null check
    nullableName = null
    var length = 0
    if (nullableName != null)
        length = nullableName.length
    else
        length = -1
    println(length)

    val l = if(nullableName != null) nullableName.length else -1
    println(l)

    // second method : safe call operator ?
    println(nullableName?.length)

    // 3rd method : elvis operator
    val len = nullableName?.length ?: -1
    println(len)

    val noName = nullableName ?: "No one knows me..."
    println(noName)

    // 4rth method : !! assertion operator
    println(nullableName)

}