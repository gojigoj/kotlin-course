package functionalprogramming

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    /*
     fold(): melakukan perhitungan setiap nilai yang berada di dalam sebuah collection,
     tanpa harus melakukan iterasi item tersebut satu-persatu
     */

    //current yang merepresentasikan nilai awal (ex: 10)
    //item merepresentasikan masing-masing item yang berada pada collection.
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    /*
     foldRight():  melakukan proses iterasi dari indeks terakhir
     dan posisi dari argumen pada lambda expression nya pun berbeda.
     */
    val foldRight = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    /*
    drop():  memangkas item yang berada di dalam sebuah objek collection berdasarkan jumlah yang ditentukan.
     */
    val drop = numbers.drop(2)

    /*
    dropLast():  memangkas item dari posisi akhir.
     */
    val dropLast = numbers.dropLast(2)

    /*
    take(): untuk menyaring item yang berada di dalam sebuah objek collection
     */
    val take = numbers.take(1)

    /*
    takeLast(): untuk menyaring item dari posisi akhir
     */
    val takeLast = numbers.takeLast(1)

    println(fold)
    println(foldRight)
    println(drop)
    println(dropLast)
    println(take)
    println(takeLast)
}