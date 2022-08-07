fun main() {
    var counter = 1

    /*
    While bersifat Entry Controlled Loop,
    Artinya, kondisi yang diberikan akan dievaluasi terlebih dahulu.
     */

    while (counter <= 7) {
        println("Hello, World!")
        counter++
    }

    /*
    Do While bersifat Exit Controlled Loop,
    di mana proses perulangan akan langsung dijalankan di awal.
     */
    do {
        println("Hello, World!")
        counter++
    } while (counter <= 7)

}