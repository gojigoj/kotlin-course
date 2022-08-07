package objectorientedprogramming

fun main() {
    val dicodingCat = Animal6("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )


    val dicodingCat2 = Animal6("Dicoding Miaw", 4.2)
    println("Nama: ${dicodingCat2.name}, Berat: ${dicodingCat2.weight}, Umur: ${dicodingCat2.age}, mamalia: ${dicodingCat2.isMammal}" )

    val dicodingCat3 = Animal7("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat3.name}, Berat: ${dicodingCat3.weight}, Umur: ${dicodingCat3.age}, mamalia: ${dicodingCat3.isMammal}")
}

class Animal6(var name: String, var weight: Double, var age: Int = 0, var isMammal: Boolean = true)

class Animal7(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = isMammal
    }
}
