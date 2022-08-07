package functionalprogramming

var newMessage = "Kotlin"

fun main() {

    //mekanisme Reflection yang berarti seperangkat fitur bahasa dan library yang memungkinkan kita untuk
    // mengamati struktur kode dari proyek yang sedang kita kerjakan secara langsung
    val sum: (Int, Int) -> Int = ::count

    val numbers = 1.rangeTo(10)

    //function references
    val evenNumbers = numbers.filter(::isEvenNumber)
    val evenNumbers2 = numbers.filter(Int::isEvenNumber2)
    println(evenNumbers)
    println(evenNumbers2)

    println(::newMessage.name)
    println(::newMessage.get())

    ::newMessage.set("Kotlin Academy")

    println(::newMessage.get())
}

fun count(valueA: Int, valueB: Int): Int {
    return valueA + valueB
}

//function references
fun isEvenNumber(number: Int) = number % 2 == 0

fun Int.isEvenNumber2() = this % 2 == 0