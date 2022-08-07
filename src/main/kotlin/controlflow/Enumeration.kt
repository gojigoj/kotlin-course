import TestClass.Companion.testone
import TestClass.Companion.testtwo
import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

/*
Enumeration merupakan salah satu fitur yang bisa kita gunakan
untuk menyimpan kumpulan objek yang telah didefinisikan menjadi tipe data konstanta
 */

fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    getListAndNameEnum()
    getListAndNameEnum2()

    //enum position
    val color: Color = Color.GREEN
    println("Position GREEN is ${color.ordinal}")

    when(color) {
        Color.RED -> println("Color is Red")
        Color.GREEN -> println("Color is Green")
        Color.BLUE -> println("Color is Blue")
    }

    IntArithmetics.TEST
}

enum class Color(val state: Int, val value: String) {
    RED(1, "Red"),
    GREEN(2, "Green"),
    BLUE(3, "Blue")
}

enum class ColorAnon(val value: Int) {
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}

enum class IntArithmetics : TitleGame {
    TEST {
        override fun getTitleGame(title: String) = title
    };
}

interface TitleGame {
    fun getTitleGame(title: String): String
}

fun getListAndNameEnum() {
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        println(color)
    }

    val color: Color = Color.valueOf("RED")
    println("Color is $color")
}

fun getListAndNameEnum2() {
    val colors: Array<Color> = enumValues()
    colors.forEach { color ->
        println(color)
    }

    val color: Color = enumValueOf("RED")
    println("Color is $color")
}

class TestClass {
    companion object {
        var testone = "TEST"
        var testtwo = "TEST"
    }
}