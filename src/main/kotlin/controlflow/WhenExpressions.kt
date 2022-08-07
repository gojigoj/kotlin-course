import kotlin.random.Random

fun main() {
    val value = 20

    when (value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

    val stringOfValue = when (value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

    val anotherStringOfValue = when(value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    /*
    when juga memungkinkan kita untuk memeriksa instance dengan tipe tertentu
    dari sebuah objek menggunakan is atau !is.
     */

    val anyType: Any = 100L
    when (anyType) {
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    val ranges = 10..50 //range
    when (value) {
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }

    //Sejak Kotlin 1.3, kita dapat menangkap subjek dari when expression di dalam sebuah variabel.
    val registerNumber = when (val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
}

fun getRegisterNumber() = Random.nextInt(100)