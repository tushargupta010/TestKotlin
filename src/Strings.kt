// String :- 2 types (Escaped String & Raw String)

fun main(args: Array<String>) {

    // Escaped string
    val str = "May the force be with you"
    println(str)

    val str1 = "May t\nhe \'force be \twith you\b\'"
    println(str1)

    // Raw string
    val rawString = """
       >A long time ago,
        >in a galaxy
        >far, far, away...
        >BUM BUM BUMMMM""".trimMargin(">")
    val rawString1 = """
       |A long time ago,
        |in a galaxy
        |far, far, away...
        |BUM BUM BUMMMM""".trimMargin()
    println(rawString)
    println(rawString1)

    /*for(char in str) {
        println(char)
    }*/

    val contentEquals = str.contentEquals("May the force be with you") // true
    val contentEquals1 = str.contentEquals("May the force be with you\n") // false
    println(contentEquals)
    println(contentEquals1)

    val contains = str.contains("force", true) // true
    val contains1 = str.contains("Force", true) // false
    println(contains)
    println(contains1)

    val uppercase = str.uppercase()
    println(uppercase)
    val lowercase = str.lowercase()
    println(lowercase)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subSequence = str.subSequence(4,13)
    println(subSequence)

    val name = "Tushar"
    println("$name have ${name.length} character length")

}