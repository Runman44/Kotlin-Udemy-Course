package chapter_7

// Class definition and constructor
class Person(var name: String, var age: Int) {

    // Only called once when object is created
    init {
        println("Object is created")
    }

    // method to add functionality
    fun speak() {
        println("Hello")
    }

    fun greet(name : String) {
        println("Hello $name")
    }

    fun getYearOfBirth() : Int {
        return 2016 - age
    }

    fun getYearOfBirth2() = 2016 - age
}

fun main(args: Array<String>) {

    val person = Person("Dennis", 25)

    println(person.name)
    println(person.age)

    // This works like a setter. Only for "var"
    person.name = "Peter"

    println(person.name)

    // Call functions
    person.speak()
    person.greet("World")
    println(person.getYearOfBirth())
    println(person.getYearOfBirth2())

}