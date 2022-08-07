package dataclassandcollections

fun main() {
    val list = (1..1_000_000).toList()

    //list, map dan set adalah jenis collection yang menjalankan eager evaluation
    /**
     * eager evaluation mengevaluasi seluruh item yang ada pada collection
     */
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    //sequence adalah collection kategori lazy evaluation
    /**
     * lazy evaluation hanya akan mengevaluasi  item jika benar-benar diperlukan
     */
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    //Fungsi generateSequence() akan membuat collection sequence secara tak terbatas.
    //kita perlu menambahkan fungsi take() supaya program tidak mengalami infinite loop.
    /*
    Fungsi ini memiliki 2 parameter.
    Parameter pertama adalah item pertama yang ada di dalam collection.
    Parameter kedua adalah lambda expression berisi perubahan pada masing-masing item.
     */
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it, ") }
}