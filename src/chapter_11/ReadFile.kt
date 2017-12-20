package chapter_11

import java.io.File

fun main(args: Array<String>) {
    // The code executes itself from the main package thats why this path.
    File("src/inputfile.txt").forEachLine {
        println(it)
    }


}