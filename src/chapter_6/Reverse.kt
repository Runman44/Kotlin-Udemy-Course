package chapter_6

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 7, 9)

    println(reverse(numbers))
    println(reverse2(numbers))
}

fun reverse(list : List<Int>) : List<Int> {
    val result = arrayListOf<Int>()

    for (i in 0 until list.size) {
        result.add(0, list[i])
    }
    return result
}

fun reverse2(list : List<Int>) : List<Int> {
    val result = arrayListOf<Int>()

    for (i in list.size - 1 downTo 0) {
        result.add(list[i])
    }
    return result
}