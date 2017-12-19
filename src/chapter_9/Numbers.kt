package chapter_9

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);

    fun containsRed() : Boolean {
        return this.rgb and 0xFF0000 != 0
    }
}

fun main(args: Array<String>) {

    // Decimal
    // 0..9
    println(20) // 20

    // Hexadecimal
    // 0..9,A,B,C,D,E,F -> 0x is a prefix.
    println(0x1F) // 31
    println(0x20) // 32
    println(0xFF) // 255
    println(0xCAFEBABE) // fun
    println(0x000000) // black
    println(0xFFFFFF) // white
    println(0xFF0000) // Red

    // Binary
    // 0..1 -> 0b is a prefix
    println(0b010101) // 21
    println(0b00000000) // 0
    println(0b11111111) // 255
    println(0b11111111 == 0xFF) // true
    println(0b1111 == 0xF) // true because 4 bits can be in total 0..15. This is the same for hexadecimal. So both print out 16.
    println(0b11111111_11111111_11111111 == 0xFFFFFF) // white

    // Bitwise operators

    // and
    // 1 and 1 == 1
    // 1 and 0 == 0
    // 0 and 1 == 0
    // 0 and 0 == 0
    //
    //      1101
    // and  1011
    // ---------
    //    = 1001
    //
    // 0x01CAFE and 0xFF0000 == 0x010000
    println(Color.RED.containsRed())
    println(Color.GREEN.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())

    println(0b111 and 0b011 == 3)

    // or
    // 1 or 1 == 1
    // 1 or 0 == 1
    // 0 or 1 == 1
    // 0 or 0 == 0
    //
    println(0b111 or 0b011 == 7)

    // xor
    // 1 or 1 == 0
    // 1 or 0 == 1
    // 0 or 1 == 1
    // 0 or 0 == 0
    //
    println(0b111 xor 0b011 == 4)

    // inverse
    // When you inverse it will be of type Int. Which holds 4 byte. 32 bits
    //
    // We can also say we are only interested in the last 4 bits.
    // Here we can use the and operator to only make us of the last 4 bits.
    // 0b0000 will be 0b1111 which is 15.
    println(0b0000.inv() and 0x0000000F == 15)
}