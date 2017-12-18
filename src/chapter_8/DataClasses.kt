package chapter_8

class Book(val title: String, val author : String, val publicationYear : Int) {
}

data class DataBook(val title: String, val author : String, val publicationYear : Int) {
}

fun main(args: Array<String>) {

    val book = Book("Normal Book", "Dennis", 2017)
    val book2 = Book("Normal Book", "Dennis", 2017)
    val dataBook = DataBook("Awesome Book", "Dennis", 2017)
    val dataBook2 = DataBook("Awesome Book", "Dennis", 2017)
    // Now it is very easy to make a copy and optionally change a value.
    val dataBook3 = dataBook.copy(author = "Jane")

    //Here we can simply fill in these values by using the data object.
    val (title, author, year) = dataBook
    println(title)
    println(author)

    // Data classes to toString method is more useful to see the values of the properties.
    println(book)
    println(dataBook)
    println(dataBook3)

    // This can be useful when doing a equals on them
    println(book.equals(book2))
    println(dataBook.equals(dataBook2))

    // Hashs
    // The data class provides us with predefined hashing. So this set will only have unique values even though the objects are different.
    val set = hashSetOf(dataBook, dataBook2, dataBook3)
    println(set)

    // Because the object is different the set does have duplicates
    val set2 = hashSetOf(book, book2)
    println(set2)

}