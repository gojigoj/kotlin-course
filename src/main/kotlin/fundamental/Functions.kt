fun main() {
    val user = setUser("Ghazi", 23)
    println(user)

    printUser("Ghazi")
}

//Perlu diketahui fungsi pada Kotlin selalu mengembalikan nilai.
//With return
fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}

//or

fun setUser2(name: String, age: Int) = "Your name is $name, and you $age years old"

//With no return
fun printUser(name: String): Unit {
    print("Your name is $name")
}

//or

fun printUser2(name: String) {
    print("Your name is $name")
}