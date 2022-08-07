package functionalprogramming

fun main() {
    val fullName = getFullName(first = "Kotlin", middle = " is ", last = "Awesome")
    println(fullName)

    val fullNameScrambled = getFullName(middle = " is ", last = "Awesome", first = "Kotlin")
    println(fullNameScrambled)

    val fullNameDefault = getFullNameDefault()
    println(fullNameDefault)

    val fullNameDefaultEdit = getFullNameDefault(first = "Dicoding")
    println(fullNameDefaultEdit)
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

fun getFullNameDefault(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"
): String {
    return "$first $middle $last"
}