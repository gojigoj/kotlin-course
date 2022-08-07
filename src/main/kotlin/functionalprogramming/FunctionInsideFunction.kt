package functionalprogramming

fun main() {
    setWord("Hello, World!")
    sum(1, 2, 3)
}

fun setWord(message: String) {
    fun printMessage() {
        println(message)
    }

    printMessage()
}

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun Int.validateNumber() {
        if (this == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB + valueC
}