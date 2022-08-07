package functionalprogramming

/**
 * Karakteristik lambda:
 * - Dalam menggunakan lambda, kita tidak perlu mendeklarasi tipe spesifik untuk nilai kembaliannya.
 * - Walaupun merupakan sebuah fungsi, lambda tidak membutuhkan kata kunci fun dan visibility modifier saat dideklarasikan,
 * karena lambda bersifat anonymous.
 * - Parameter yang akan ditetapkan berada di dalam kurung kurawal {}.
 * - Ketika ingin mengembalikan nilai, kata kunci return tidak diperlukan lagi
 * karena kompiler akan secara otomatis mengembalikan nilai dari dalam body.
 * -Lambda expression dapat digunakan sebagai argumen untuk sebuah parameter dan dapat disimpan ke dalam sebuah variabel.
 */

fun main() {
    message()
    messageParameter("Hello from Lambda")
    val length = messageReturn("Hello from Lambda")
    println("Message length $length")

}

val message = { println("Hello from Lambda") }

val messageParameter = { message:String -> println(message) }

val messageReturn = { message:String -> message.length }