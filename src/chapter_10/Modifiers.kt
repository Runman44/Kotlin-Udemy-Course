package chapter_10

class Animal {

    // In kotlin you always using the properties.
    // You don't run into the problem when you want to change the behaviour of setting a value in a public property that you
    // need to change a lot of code like in the main function. (like Java)

    // var has getters/setters.
    var age : Int = 0
        get() = field   // this will return the real property
                        // this.place isn't going to work here because internally it is calling the getter. (inf loop)
        set(value) {
            // We can define our own getter/setter impl.
            // Here it make sense to do some data validation so that the age of the animal is at least 0 or above.
            if (value >= 0){
                field = value
            }
        }

    // val only has getters.
    val name : String = "Peter"

}

open class Building {

    // Only accessible in the same class.
    private var place : String = "New York"

    // Only accessible in the same class and sub-classes
    protected var name : String = "Twin towers"

    // Only accessible in the same module (package with the blue icon)
    internal var isDangerous = true

    // Accessible everywhere
    public var isAccessible = true
}

class House : Building() {

    fun getBuildingName() {
        this.name = "IKEA"
    }
}

fun main(args: Array<String>) {

    val animal = Animal()
    // Internally this calls the setter.
    animal.age = 8
    // Internally this calls the getter.
    print(animal.age)
}