package chapter_4

fun main(args: Array<String>) {

    // Continue
    for (c in "Phyton") {
        if (c == 'o') {
            continue
        }
        println(c)
    }

    // Break
    for (c in "Phyton") {
        if (c == 'o') {
            break
        }
        println(c)
    }

    // Return
    for (c in "Phyton") {
        if (c == 'o') {
            return
        }
        println(c)
    }

    // Naming loops
    outerLoop@ for (i in 1..10) {
        innerLoop@ for (j in 1..10) {
            if (i - j == 5) {
                break@outerLoop
            }
            println("$i - $j")
        }
    }
}