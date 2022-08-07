fun main() {
    val openOffice = 7
    val now = 8

    //if as statement
    //karena tidak mengembalikan nilai apapun
    if (now > openOffice) {
        println("Office already open")
    } else {
        println("Office closed")
    }

    //if as expression
    //karena mengembalikan nilai dan dapat disimpan disebuah variable
    val office = if (now >  openOffice) "Office already open" else "Office closed"

    println(office)

    //expression in expression
    sum(1, 1*4)

    //statement
    val value1 = 10
    val value2 = 10

    //expresion
    sum(value1, value2)

    /**
     * if expression sebaiknya digunakan ketika
     * kondisi yang diberikan tidak lebih dari 2 (dua)
     * dan kondisi yang diberikan tidak terlalu rumit.
     */
}

fun sum(value1: Int, value2: Int) = value1 + value2

