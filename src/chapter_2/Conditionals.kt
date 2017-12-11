package chapter_2

fun main(args: Array<String>) {
    // If statements
    val age = 15

    if (age < 18) {
        println("you cannot do this")
    } else if (age < 21) {
        println("perhaps you can do this")
    } else {
        println("you can do this")
    }

    //When statements

    val mode: Int = 3
    when (mode) {
        1 -> println("yay")
        2 -> println("two times")
        3 -> {
            println("more then one line")
            println("wuut")
        }
        // the default when no condition has been met.
        else -> println("unknown mode")
    }

    // Conditional Expressions

    val state = 5

    val result = when(state) {
        1 -> "1"
        2 -> "2"
        3 -> {
            println("we do can stuff here")
            "3"
        }
        else -> "yay"
    }
    println(result)

    val x = if(state < 3) {
        50
    } else {
        30
    }
    println(x)

    // Advanced when statements

    val y = 5

    val z = when(y) {
        1 -> "yes"
        "no".length -> "this is 2"
        in 5..10 -> "range of 5 till 10"
        !in 5..10 -> "not in this range"
        else -> "other"
    }


}