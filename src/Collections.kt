// Kotlin's collections is built on java collections.
// mutable and immutable
fun main(args: Array<String>) {
    // ImMutable List
    val imperials = listOf("Emperor","Darth Vader", "Boba Fett", "Tarkin")
    println(imperials)
    // we can't alter the above list :- add, remove

    println(imperials.sorted())
    println(imperials[2])
    println(imperials.last())
    println(imperials.contains("Emperor")) // true
    println(imperials.contains("emperor")) // false

    // Mutable List
    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0 , "Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))
    rebels.remove("Han Solo")
    println(rebels)


    // ImMutable Map
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap)
    println(rebelVehiclesMap["Luke"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leiah", "This ship doesn\'t exist"))
    println(rebelVehiclesMap.keys)
    println(rebelVehiclesMap.values)

    // Mutable Map
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")
    println(rebelVehicles)
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    println(rebelVehicles.isEmpty())
    println(rebelVehicles.clear())
    println(rebelVehicles.isEmpty())


}