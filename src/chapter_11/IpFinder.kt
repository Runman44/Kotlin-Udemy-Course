package chapter_11

import java.io.File

fun main(args: Array<String>) {

    val ipAddresses = mutableMapOf<String, Int>()

    File("src/ips.txt").forEachLine {
//        val ip = IPAddress(it)

        // First try
//        if (ipAddresses.containsKey(ip.address)) {
//            var times = ipAddresses.getValue(ip.address)
//            ipAddresses.put(ip.address, ++times)
//        } else {
//            ipAddresses.put(ip.address, 1)
//        }

        // Awesome Kotlin way
        val previous = ipAddresses.getOrDefault(it, 0)
        ipAddresses.put(it, previous + 1)
    }

    // First try
//    var maxCount = 0
//    var mostUsedIp = ipAddresses.keys.first()
//    for ((ip, count) in ipAddresses.entries) {
//        if(count > maxCount) {
//            mostUsedIp = ip
//            maxCount = count
//        }
//    }

    // Awesome Kotlin way
     val (mostUsedIp, maxCount) = ipAddresses.entries.maxBy { it.value }!!

    println("The most used IP address is: $mostUsedIp with the number of $maxCount times!")
}

//class IPAddress(val address: String)