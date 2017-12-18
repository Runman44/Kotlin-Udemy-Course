package chapter_7

open class Developer(open var name: String, open var age: Int) {

    open fun speak() {
        println("Hello")
    }
}

class Android(override var name : String, override var age: Int) : Developer(name, age) {

    override fun speak() {
        println("Howya")
    }
}

open class Apple(override var name: String, shouldDoAndroid : Boolean = true) : Developer(name, 30) {

    final override fun speak() {
        println("Sup")
    }
}

class Apple2(override var name: String) : Apple(name) {

    // Can't override this from Apple because its override is Final.
//    override fun speak() {
//        println("Sup")
//    }

}


fun main(args: Array<String>) {

    val dev1 = Android("Dennis", 25)
    val dev2 = Apple("Jasmin")
    val dev3 = Developer("Peter", 20)

    dev1.speak()
    dev2.speak()
    dev3.speak()

    if (dev1 is Developer) {
        dev1.speak()
    }
}