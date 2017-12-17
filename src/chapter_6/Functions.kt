package chapter_6

import java.util.*

fun main(args: Array<String>) {
    helloWorld()
    printWithSpaces("Kotlin")
    println(getCurrentDate())
    println(max(109,26))
}

// No parameter and no return value
fun helloWorld() {
    println("Hello world")
}

// With parameter but no return value
fun printWithSpaces(text: String) {
    for (char in text) {
        print(char + " ")
    }
    println()
}

// With return value but no parameter
fun getCurrentDate() : Date {
    return Date()
}

// With parameter and return value
fun max(x : Int, y : Int) : Int {
    return if (x >= y) x else y
}