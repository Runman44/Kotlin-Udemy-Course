package chapter_8

abstract class Course(val name : String) {

    open fun learn() {
        println("You are learning $name")
    }

}

interface Learnable {
    fun learn() {
        println("Learning...")
    }
}

open class KotlinCourse : Course("Kotlin"), Learnable {

    // Because it is in the interface we need to override it.
    final override fun learn() {
        //Calls the super. Generics is used to specify which class/interface
        super<Learnable>.learn()
        println("The topic is: $name")
    }

}

class SpecialKotlinCourse : KotlinCourse() {

    // We cannot override the learn method because it is final.

}

fun main(args: Array<String>) {

    val course = SpecialKotlinCourse()
    course.learn()

}