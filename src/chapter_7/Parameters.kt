package chapter_7

class House(val height : Double, val color : String = "Orange", val price : Int) {

    fun print() {
        println("House [height : $height, color: $color, price: $price]")
    }

}

fun main(args: Array<String>) {
    // Using named params to make things clear
    val house = House(height = 4.5, color = "Yellow", price = 15_000)
    house.print()

    // Using named params to shift order
    val oldHouse = House(color = "Red", height = 5.5, price = 45_000)
    oldHouse.print()

    // Using default values
    val newHouse = House(height = 3.5, price = 80_000)
    newHouse.print()
}