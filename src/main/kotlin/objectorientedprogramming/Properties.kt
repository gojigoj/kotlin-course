package objectorientedprogramming

class Animal2{
    //getter dan setter pada property mutable bisa di custom
    var name: String = "Dicoding Miaw"
        get() {
            println("Fungsi getter terpanggil")
            return field
        }
        set(value) {
            println("Fungsi Setter terpanggil")
            field = value
        }
}

fun main() {
    val dicodingCat = Animal2()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}