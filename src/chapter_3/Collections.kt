package chapter_3

fun main(args: Array<String>) {

    // this creates an array where the amount of elements is predefined.
    val array = arrayOf("Texas", "Nevada")
    val mixed = arrayOf(3, 3.0, "yay")
    val numbers = intArrayOf(1,2,3,4,5)

    // arrays begin with index 0
    println(mixed[0])
    mixed[2] = 4.5
    println(mixed[2])

    val stringIsAnArrayOfChars = "string"
    println(stringIsAnArrayOfChars[2])

    // concat arrays
    val states = arrayOf("New York", "New Jersey")
    val allStates = states + array

    // this creates an immutable list. You cannot change this list.
    val list = listOf("Banana", "Strawberry")

    // this creates a mutable list. You can change this list.
    val arrayList = arrayListOf("Jan", "Sarah")
    arrayList.add("Peter")
    arrayList.add(0, "Jane")
    println(arrayList.isEmpty())
    println(arrayList.size)
    println(arrayList + states)
    val removed = arrayList.remove("Sarah")
    println(removed)

    // Sublist
    val subList = arrayList.subList(1, 3)
    println(subList)
}