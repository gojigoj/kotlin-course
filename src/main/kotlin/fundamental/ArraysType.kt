fun main() {
    val array = arrayOf(1, 3, 5, 7)
    val mixArray = arrayOf(1, 3, 5, 7, "Dicoding", true)

    val intArray = intArrayOf(1, 3, 5, 7)
    println(intArray[2])


    intArray[2] = 11
    println(intArray[2])

    //Array()
    //Constructor pada Array() membutuhkan 2 argumen yaitu size dan fungsi lambda
    val intArray2 = Array(4) { i -> i * i }
}