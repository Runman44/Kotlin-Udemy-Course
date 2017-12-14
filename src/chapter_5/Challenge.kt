package chapter_5

/**
 * Create an array list of your favorite book titles. Loop over this list and, if
 * the title contains the letter ‘e’, print each character of the name on a new line.
 */
fun main(args: Array<String>) {

    val books = arrayListOf("Harry Potter", "Passion", "Tibet", "Kotlin for Dummies")
    bookLoop@ for (book in books) {
        if (!book.contains('e')) {
            continue@bookLoop
        }
        println(book)

        // print each char of the new on a new line
        for (char in book) {
            println(char)
        }
    }
}