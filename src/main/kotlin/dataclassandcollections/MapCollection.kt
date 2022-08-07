package dataclassandcollections

fun main() {
    //Map adalah collection yang dapat menyimpan data dengan format key-value
    //_key_ to _value_
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    /*
    Saat menggunakan simbol [ ] atau yang kita kenal dengan indexing,
    konsol akan menampilkan hasil null saat key yang dicari tidak ada di dalam Map.
     */
    println(capital["Jakarta"])

    //Sedangkan saat kita menggunakan getValue(), konsol akan memberikan sebuah Exception.
    println(capital.getValue("Jakarta"))

    val mapKeys = capital.keys //mengembalikan dengan tipe set
    val mapValues = capital.values //mengembalikan dengan tipe collection

    println(mapKeys)
    println(mapValues)

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    /**
     * Namun perlu diperhatikan bahwa menggunakan mutable collection itu tidak disarankan.
     */
}