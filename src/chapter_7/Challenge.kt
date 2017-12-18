package chapter_7

/**
 * Create a class representing a book. Every book has a title, an author, a
 * publication year and is either borrowed or not. Choose an appropriate
 * data type for each of these properties.
 *
 * A book can be borrowed from you or returned to you. In both cases, the
 * borrowed property is updated accordingly. Also, a book should be able
 * to print itself to the command line, including its title, author, and publication year.
 */
fun main(args: Array<String>) {

    val book = Book("Harry Potter", "C.K Rowing", 2015, false)
    book.returnBook()
    book.borrow()
    book.borrow()
    book.returnBook()
    book.print()
}

class Book(val title: String, val author : String, val publicationYear : Int, var isBorrowed : Boolean) {

    fun print() {
        println("Title: $title - Author: $author - Year: $publicationYear")
    }

    fun borrow(){
        if(isBorrowed) {
            println("Already taken, sorry!")
        } else {
            isBorrowed = true
        }
    }

    fun returnBook() {
        if(isBorrowed) {
            isBorrowed = false
        } else {
            println("How do you return something that was not taken?, sorry!")
        }
    }
}