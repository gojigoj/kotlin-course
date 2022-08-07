fun main() {
    val intNumber: Int = 100
    val longNumber: Long = 100
    val longNumber2 = 100L
    val shortNumber: Short = 10
    val byteNumber = 0b11010010
    val doubleNumber: Double = 1.6
    val floatNumber: Float = 0.123456789f

    val max_int = Int.MAX_VALUE
    val min_int = Int.MIN_VALUE

    println(max_int)
    println(min_int)

    val maxInt = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")

    //Konversi byte to int
    val byteNum: Byte = 10
    val intNum: Int = byteNum.toInt()

    //Readable
    val readableNumber = 1_000_000
    println(readableNumber)

}