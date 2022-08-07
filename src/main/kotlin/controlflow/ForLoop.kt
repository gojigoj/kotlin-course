fun main() {
    //For dapat digunakan pada Ranges, Collections, Arrays dan apapun yang menyediakan iterator.
    val ranges = 1..10
    for (i in ranges) {
        println("value is $i!")
    }

    /*
    Kita juga dapat mengakses indeks untuk setiap elemen yang ada
    pada Ranges dengan memanfaatkan fungsi withIndex()
     */
    val rangesWithStep = 1.rangeTo(10) step 3
    for ((index, value) in rangesWithStep.withIndex()) {
        println("value $value with index $index")
    }

    //fitur forEach
    rangesWithStep.forEach { value ->
        println("value is $value!")
    }

    //forEach with index
    rangesWithStep.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}