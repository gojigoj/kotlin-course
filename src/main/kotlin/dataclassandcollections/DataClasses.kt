package dataclassandcollections

class User(val name: String, val age: Int) {

    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

//data class bertujuan untuk mengurangi jumlah kode boilerplate
data class DataUser(val name: String, val age: Int) {
    fun intro() {
        println("My name is $name, I am $age years old")
    }
}

fun main() {
    val user = User("Ghazi", 23)
    val user2 = User("Ghazi", 23)
    val user3 = User("dimas", 24)

    println(user)

    println(user.equals(user2))
    println(user.equals(user3))

    val dataUser = DataUser("Ghazi", 23)
    val dataUser2 = DataUser("Ghazi", 23)
    val dataUser3 = DataUser("dimas", 24)

    //data class sudah memiliki fungsi toString() secara otomatis.
    println(dataUser)

    //data class sudah memiliki fungsi equals() secara otomatis.
    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

    //data class sudah tersedia fungsi copy()
    val dataUser4 = dataUser.copy()
    //hasil copy juga dapat dimodifikasi
    val dataUser5 = dataUser.copy(age = 5)

    println(dataUser4)
    println(dataUser5)

    //Destructuring Declaration adalah proses memetakan objek menjadi sebuah variabel
    //Dengan fungsi componentN() yang ada pada data class
    val name = dataUser.component1()
    val age = dataUser.component2()
    val (name2, age2) = dataUser3

    println("My name is $name, I am $age years old")
    println("My name is $name2, I am $age2 years old")

    dataUser.intro()
}