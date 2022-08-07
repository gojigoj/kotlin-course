package objectorientedprogramming

import kotlin.reflect.KProperty

fun main() {
    val animal = Animal3()
    animal.name = "Dicoding Miaw"
    println("Nama Hewan: ${animal.name}")

    val person = Person()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")

    val hero = Hero()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")

    val animal2 = Animal4()
    animal2.name = "Dicoding cat"
    animal2.weight = 6.2
    animal2.age = 1

    println("Nama: ${animal2.name}")
    println("Berat: ${animal2.weight}")
    println("Umur: ${animal2.age} Tahun")
}

class Animal3 {
    var name: String by DelegateName()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

class Animal4 {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

/*
Teknik Delegate: sebuah kelas yang memang bertugas untuk mengatur atau mengelola fungsi
 getter dan setter untuk sebuah properti kelas.
 */
class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

//Teknik Delegate juga bisa digunakan di seluruh tipe data
class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}