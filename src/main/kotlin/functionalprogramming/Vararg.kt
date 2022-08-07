package functionalprogramming

/**
 * vararg digunakan ketika sebuah fungsi yang menggunakannya
 * tidak mengetahui jumlah argumen yang akan disematkan ketika fungsi tersebut dipanggil.
 */

fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    println(number)

    val numberArray = sizeNumbers(10, 20, 30, 40)
    println(numberArray)

    //perbedaan dengan Array<T> sebagai parameter
    //fungsi tersebut membutuhkan argumen berupa nilai yang sudah berbentuk Array
    val numberArrays = arrayOf(10, 20, 30, 40)
    sets(numberArrays)

    //memanfaatkan spread operator (*) untuk memasukkan array ke dalam vararg
    val numberVarargArray = intArrayOf(10, 20, 30, 40)
    sets(10, 20, 20, *numberVarargArray , 10)
}

/**
 * tidak diizinkan untuk memiliki 2 (dua) parameter bertanda vararg.
 * parameter yang ditandai dengan vararg sebaiknya berada pada posisi pertama.
 */

//menyederhanakan beberapa parameter yang memiliki tipe data yang sama menjadi parameter tunggal.
fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun sizeNumbers(vararg number: Int): Int {
    return number.size
}

//menerapkan Generic untuk tipe parameter ketika parameter tersebut ditentukan dengan vararg.
fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input) {
        result.add(item)
    }
    return result
}

fun sets(number: Array<Int>): Int {
    return number.sum()
}

fun sets(vararg number: Int): Int {
    return number.sum()
}