fun main() {
    val text: String? = null

    //Safe Calls
    var textLength = text?.length

    //Elvis Operator
    textLength = text?.length ?: 7

    println(textLength)
}