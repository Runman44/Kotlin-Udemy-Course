package chapter_11

fun main(args: Array<String>) {
    //Use maps when you want to map to values to each other
    val namesToAges = mapOf(
            "Peter" to 24,
            "Roger" to 21
    )

    val namesToAges2 = mapOf(
            "Peter" to 24,
            "Roger" to 21
    )

    println(namesToAges == namesToAges2)

    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)


    val namesToAges3 = mutableMapOf(
            "Peter" to 24,
            "Roger" to 21
    )

    namesToAges3.put("Sarah", 19)
    // Only put it in if the Key isn't in the map yet
    namesToAges3.put("Jane", 19)

    println(namesToAges3)

    namesToAges.entries.forEach {
        println("${it.key} is ${it.value} years old.")
    }
}