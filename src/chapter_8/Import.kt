package chapter_8

// Import with an import statement

// Import everything in the package util, using wildcard
import java.util.*

// Explicitly import the BigDecimal
import java.math.BigDecimal

// Import a class from our own code
import chapter_7.MotorCycle

// Import a function of a object class. This is possible because there is only one instance of it.
import chapter_8.Cache.retrieveData

// Import enum values
import chapter_8.Color.YELLOW


class World() {

    // import by qualifying the name
    fun getCurrentDate() : java.util.Date {
        return Date()
    }

}