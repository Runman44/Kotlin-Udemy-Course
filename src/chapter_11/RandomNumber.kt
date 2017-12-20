package chapter_11

import java.util.*

fun main(args: Array<String>) {
    val random = Random().nextInt(101) // number between 0..100

    var input : String?
    var guess = -1
    var highestGuess = 100
    var lowestGuess = 0

    while (guess != random) {
        print("Take a guess between $lowestGuess and $highestGuess: ")

        // This will always be a string.
        input = readLine()

        if (input != null) {
            guess = input.toInt()


            if (guess > random) {
                if (guess < highestGuess) {
                    highestGuess = guess
                }
                println("guess lower")
            } else if (guess < random) {
                if (guess > lowestGuess) {
                    lowestGuess = guess
                }
                println("guess higher")
            } else {
                println("Congrats it was indeed $guess")
            }
        }
    }
}