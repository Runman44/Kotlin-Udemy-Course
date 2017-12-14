package chapter_4

fun main(args: Array<String>) {

    //For loop
    var sum = 0
    for (i in 1..10) {
        sum += i
        println(sum)
    }

    val list = listOf("Hello", "Goodbye")
    for (element in list) {
        println("element is $element")
    }

    for ((index, value) in list.withIndex()) {
        println("index is $index, and value is $value")
    }

    //While loop

    var x = 9
    while (x >= 0) {
        println(x)
        x--
    }

    var i = 0
    while (i <= 10) {
        println(i)
        i++
    }

    // Do...While loop
    do {
        var y = 1
        println(y)
        y++
    } while (y <=1) // y is visible here!

}