package chapter_1

fun main(args: Array<String>) {

    val name = "peter"
    //name = "patrick" //error: val cannot be reassigned

    var age = 10
    age = 20 // valid because a var is mutable

    // b will be an int even though it might be a Byte. To store values explicitly we do the following
    val b = 4

    // Now c will be stored as a value with data type Byte.
    val c: Byte = 4

    // Casting
    var float2: Float = 3.4f
    var double2: Double = 0.0

    // double2 = float2 // error: type mismatch: inferred type is Float but Double was expected
    // To make this work:
    double2 = float2.toDouble()
    // As you see float is not that precise as double is. So this could be dangerous.
    println(double2) // 3.4000000953674316

    // Null-Safety
    var string: String? = null
    string?.length
    string!!.length
}