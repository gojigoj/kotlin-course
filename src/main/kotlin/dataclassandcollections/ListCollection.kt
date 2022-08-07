package dataclassandcollections

fun main() {
    //List tersebut bersifat immutable alias tidak bisa diubah

    val numberList = listOf(1, 2, 3, 4)
    val numberList2 = listOf(1, 2, 3, 4)
    val anyList = listOf('a', "Kotlin", 3, true)
    val anyMutableList = mutableListOf('a', "Kotlin", 3, true)

    anyMutableList.add('d') // menambah item di akhir list
    anyMutableList.add(1, "love") // menambah item pada indeks ke-1
    anyMutableList[3] = false // mengubah nilai item pada indeks ke-3
    anyMutableList.removeAt(1) // menghapus item User() berdasarkan index atau posisi nilai di dalam Array

    val longMutableList = (3 until 4).toList().map { it.toLong() }.toMutableList()
    println(longMutableList)
    longMutableList[0] = 1 + 2

    println(anyList[3])
}

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
