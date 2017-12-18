package chapter_8

/**
 * Let’s say we’re running a library where you can lend books and also some
 * movies. We want to write an application to keep track of our inventory.
 *
 * Create an interface Lendable that defines a borrow() method. Then create an
 * abstract class InventoryItem and two classes Book and DVD which inherit from
 * InventoryItem. InventoryItem should implement the Lendable interface.
 * Books and DVDs both have a title, genre and publication year. Books also have
 * an author whereas DVDs have a length in seconds.
 *
 * Add each property to the most suitable class.
 */
fun main(args: Array<String>) {

}

interface Lendable {
    fun borrow()
}

abstract class InventoryItem(val title: String, val genre : String, val publicationYear : Int, var isBorrowed : Boolean) : Lendable {

    override fun borrow() {
        if (isBorrowed) {
            println("Better luck next time")
        } else{
            isBorrowed = true
        }
    }

}

class LibraryBook(title: String, genre : String, author: String, publicationYear : Int) : InventoryItem(title, genre, publicationYear, false) {

}

class LibraryDVD(title: String, genre : String, lengthInSeconds: Int, publicationYear : Int) : InventoryItem(title, genre, publicationYear, false) {

}
