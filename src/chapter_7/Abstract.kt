package chapter_7

abstract class Phone(open var name: String, open var buildYear: Int) {
    abstract fun speak()

    fun greet() {
        println("can still have methods")
    }
}

class Samsung(override var name : String, override var buildYear: Int) : Phone(name, buildYear) {

    override fun speak() {
        println("Howya")
    }
}

class Sony(override var name: String) : Phone(name, 1990) {

    override fun speak() {
        println("Sup")
    }
}

fun main(args: Array<String>) {

    val dev1 = Samsung("S7", 2017)
    val dev2 = Sony("Xperia 4Z")

    // Not possible to make an instance for a abstract class.
    // val dev3 = Phone("Nokia 8", 2019)

    dev1.speak()
    dev2.speak()
}