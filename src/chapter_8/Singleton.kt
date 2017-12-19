package chapter_8

// The Object keyword is the same as Singleton
object Cache {
    fun retrieveData() : Int {
        return 0
    }
}

// Using an enum
class Car(val color : Color) {
    fun println() {
        println("color is: $color")
    }
}

fun main(args: Array<String>) {
    val data = Cache.retrieveData()
    val car = Car(Color.YELLOW)
    car.println()
}