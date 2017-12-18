package chapter_7

interface Driveable {

    // Implicit abstract
    fun drive()

    fun sameMethod()

}

interface Buildable {
    val timeRequired : Int

    // Now because it has a body its not required to override this method anymore.
    fun build() {
        println("Already building")
    }

    fun sameMethod()

}

class Car(val color: String) : Driveable, Buildable {

    override val timeRequired: Int = 120

    override fun build() {
        println("Building !")
    }

    override fun drive() {
        println("Driving!")
    }

    override fun sameMethod() {
        println("same result?")
    }
}

class MotorCycle(val color: String) : Driveable, Buildable {
    override val timeRequired: Int = 120

    override fun drive() {
        println("Driving Motor!")
    }

    override fun sameMethod() {
        println("same result?")
    }
}

fun main(args: Array<String>) {

    val car : Driveable = Car("blue")
    // Can only access whats inside the Driveable interface.
    car.drive()

    val motor : Driveable = MotorCycle("blue")
    motor.drive()
    motor.sameMethod()
}