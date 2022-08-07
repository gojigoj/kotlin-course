package functionalprogramming

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }
    val sumNull: NullArithmetic = { valueA, valueB -> valueA + valueB }

    //with invoke
    val sumResult = sum.invoke(10, 10)
    //or not
    val multiplyResult = multiply(20, 20)

    val sumNullResult = sumNull?.invoke(10, 10)
}

//beberapa fungsi yang memiliki function type yang sama, bisa disederhanakan.

typealias Arithmetic = (Int, Int) -> Int
typealias NullArithmetic = ((Int, Int) -> Int)?



