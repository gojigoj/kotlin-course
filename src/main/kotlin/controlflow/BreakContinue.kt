fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    //Continue digunakan untuk melewatkan proses iterasi dan lanjut dengan proses iterasi berikutnya.
    for (i in listOfInt) {
        if (i == null) continue
        println(i)
    }

    //Break digunakan untuk menghentikan proses iterasi.
    for (i in listOfInt) {
        if (i == null) break
        println(i)
    }

    //Pada Kotlin, sebuah expression dapat ditandai dengan sebuah label.
    loop@ for (i in 1..10) {
        println("Outside loop")
        for (j in 1..10) {
            println("Inside loop")
            if (j > 5) break@loop
        }
    }
}