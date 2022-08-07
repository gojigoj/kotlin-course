fun main() {
    /*
    Jarak antara dua nilai yang dicakup, ditentukan oleh step.
    Secara default, step bernilai 1.
     */

    val rangeInt = 1..10
    rangeInt.forEach {
        print("$it, ")
    }
    println()

    val rangeInt2 = 1..10 step 2
    rangeInt2.forEach {
        print("$it, ")
    }
    println()
    println(rangeInt2.step)

    //menggunakan rangeTo
    val rangeInt3 = 1.rangeTo(10)

    //menggunakan downTo
    val downInt = 10.downTo(1)

    //memeriksa nilai pada Range
    if (7 in downInt) {
        println("value 7 is available")
    }

    //range pada char
    val rangeChar = 'A'.rangeTo('F')

}