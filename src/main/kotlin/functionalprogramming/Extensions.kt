package functionalprogramming

/**
 * Kotlin memungkinkan kita untuk menambahkan sebuah fungsi baru pada sebuah kelas tanpa harus mewarisi kelas tersebut
 */

fun main() {
    10.printInt()
    println(10.plusThree())

    println(10.slice)
}

//Extension Functions
fun Int.printInt() {
    println("value $this")
}

fun Int.plusThree(): Int {
    return this + 3
}

//Extension Properties
val Int.slice: Int
    get() = this / 2

