package functionalprogramming

//Context Object

/**
 * Lambda Receiver
 * - for run, with and apply
 * - Cara ini memiliki kekurangan yaitu
 * kita tidak dapat membedakan objek receiver dengan objek yang berada dari luar lingkup fungsi tersebut.
 */

/**
 * Lambda Argument
 * - for let and also
 */

fun main() {
    /*
    run: Fungsi run akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda
     */
    val text = "Hello"
    val resultRun = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result: $resultRun")

    /*
    with: Konteks objeknya disematkan sebagai argumen dan dari blok lambda diakses sebagai receiver
     */
    val message = "Hello Kotlin!"
    val resultWith = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }
    println(resultWith)

    /*
    apply: nilai yang dikembalikan dari fungsi apply adalah nilai dari konteks objeknya
    dan objek konteksnya tersedia sebagai receiver (this).
     */
    val messageLambda = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }
    println(messageLambda.toString())

    /*
    let: menggunakan argumen (it) untuk mengakses konteks dari sebuah objek,
    untuk nilai kembalian, ia bergantung pada expression yang berada di dalam blok lambda
     */

    val messageLet: String? = null
    messageLet?.let { //if not null
        val length =  it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run { //if null
        val text = "message is null"
        println(text)
    }

    /*
    also: nilai yang dikembalikan adalah nilai dari konteks objek.
    digunakan ketika ingin menggunakan konteks dari objek sebagai argumen tanpa harus mengubah nilainya.
     */
    val textAlso = "Hello Kotlin"
    val result = textAlso.also {
        println("value length -> ${it.length}")
    }
    println("text -> $result")

}