package functionalprogramming

fun main() {
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    /*
     slice(): untuk menyaring item dari posisi tertentu pada collection,
     membutuhkan sebuah argumen berupa Range untuk menentukan posisi pertama dan terakhir yang akan disaring
      */
    val slice = total.slice(3..6)
    val slice2 = total.slice(3..6 step 2)

    val index = listOf(2, 3, 5, 8)
    val slice3 = total.slice(index)

    /*
     distinct(): untuk menyaring item yang sama pada collection
     distinct() tidak dapat digunakan pada object Map Collection.
      */

    val total2 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()

    data class Item(val key: String, val value: Any)

    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }

    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinctLength = text.distinctBy { it.length }

    /*
     chunked(): untuk memecah nilai String menjadi beberapa bagian kecil dalam bentuk Array
      */

    val word = "QWERTY"
    val chunked = word.chunked(3)
    val chunkedTransform = word.chunked(3) {
        it.toString().lowercase()
    }

    println(slice)
    println(slice2)
    println(slice3)
    println(distinct)
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }
    println(distinctLength)
    println(chunked)

}