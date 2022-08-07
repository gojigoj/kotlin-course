package dataclassandcollections

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //Filter mem-filter atau menyaring suatu data dalam sebuah collection.
    val evenList = numberList.filter { it % 2 == 0 }
    val evenoddList = numberList.filterNot { it % 2 == 0 }

    //Map membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya
    val multipliedBy5 = numberList.map { it * 5 }

    //Count menghitung jumlah item pada collections
    println(numberList.count())

    // menampilkan jumlah item pada numberList yang merupakan kelipatan dari 3.
    println(numberList.count { it % 3 == 0 })
    println(numberList.count { it % 3 == 0 })

    //find adalah fungsi untuk mencari item pertama yang sesuai dengan kondisi yang kita tentukan.
    val firstOddNumber = numberList.find { it % 2 == 0 }

    //firstOrNull: fungsi akan mengembalikan nilai null,  jika di dalam collection tidak ditemukan data yang sesuai di bagian awa;
    //lastOrNull: fungsi akan mengembalikan nilai null,  jika di dalam collection tidak ditemukan data yang sesuai di bagian akhir
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    val lastOrNullNumber = numberList.lastOrNull { it % 2 == 3 }

    //fungsi first() dan last() digunakan untuk menyaring item pertama atau terakhir dari sebuah collection
    //Namun jika kondisi tidak terpenuhi akan menyebabkan exception
    val moreThan10 = numberList.first { it > 10 }
    print(moreThan10)

    //Fungsi sum akan menjumlahkan setiap data yang ada pada collection
    val total = numberList.sum()

    //sorted() digunakan untuk mengurutkan item yang ada di dalam collection.
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    val descendingSort = kotlinChar.sortedDescending()


}