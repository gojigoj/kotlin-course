package functionalprogramming

/**
 * Higher-Order Function,
 * sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter, menjadikan tipe kembalian, ataupun keduanya.
 */

fun main() {
    printResult(10, sum)
    //or
    printResult(10){ value ->
        value + value
    }
    println(multiplyInt { first, second ->
        first * second
    })
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value + value}

fun multiplyInt(multiply: (Int, Int) -> Int): Int {
    return multiply(10, 10)
}
