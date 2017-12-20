package chapter_11

fun main(args: Array<String>) {

    print("Enter the word to guess: ")
    val word = readLine()

    if (word == null) {
        println("stopping!")
        return
    }

    for (i in 1..100) {
        println()
    }

    //The letters to be guessed.
    val letters = word.toLowerCase().toHashSet()
    val correctLetters = mutableSetOf<Char>()
    var fails = 0

    while (letters != correctLetters) {
        // print out the word
        printExploredWord(word, correctLetters)
        // print out the fail tries
        println("You have guessed wrong for $fails times")
        println()
        print("Your letter: ")
        val letter = readLine()

        if (letter != null) {
            val chars = letter.toLowerCase().toCharArray()
            if (chars.size > 1) {
                println("Please only insert 1 letter at a time.")
                continue
            } else if (letters.contains(chars[0])) {
                correctLetters.add(chars[0])
            } else {
                fails++
            }
        }
    }

    println("You have won!")
}

fun printExploredWord(word : String, guessedLetters : Set<Char>) {
    val exploredWord = StringBuilder()
    for (char in word.toLowerCase()) {
        if (guessedLetters.contains(char)) {
            exploredWord.append(char)
        } else {
            exploredWord.append("_")
        }
        exploredWord.append(" ")
    }
    println(exploredWord.toString())
}