fun main(args: Array<String>) {

    fun forceChoke() {
        println("forceChoke function called")
    }

    forceChoke()

    fun makeAnEntrance(line: String) {
        println(line)
    }

    makeAnEntrance("I find your lack of faith disturbing.")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int {
        val goodGuys = rebels + ewoks
        return goodGuys
    }

    println("Darth Vender faced off against ${calculateNumberGoodGuys(5,2)} rebel scum")
    val rebels = calculateNumberGoodGuys(5,7)
    println("Darth Vender faced off against $rebels rebel scum")

    fun venderIsFeeling(mood:String = "angry") {
        println(mood)
    }
    venderIsFeeling()
    venderIsFeeling("happy")

}