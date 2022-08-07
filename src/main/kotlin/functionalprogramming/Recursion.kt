package functionalprogramming

fun main() {
    factorialNew(5)
}

/*
Ketika kita menjalankan fungsi di bawah, program akan menciptakan tumpukan frame dengan jumlah berdasarkan nilai n
di mana setiap frame akan mengkonsumsi memori. Ini bisa jadi masalah dalam penerapannya.
 */

fun factorialOld(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorialOld(n - 1)
    }
}

/*
tail recursion:sekumpulan urutan instruksi untuk menjalankan tugas tertentu (subroutine)
 yang dijalankan terakhir pada sebuah prosedur.
 */

tailrec fun factorialNew(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorialNew(n - 1, newResult)
    }
}