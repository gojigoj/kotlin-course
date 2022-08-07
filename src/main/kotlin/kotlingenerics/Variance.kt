package kotlingenerics

fun main() {

}

//Covariant
//nilai dari tipe parameter tersebut hanya bisa diproduksi seperti menjadikanya sebagai return type
interface List<out E> : Collection<E> {
    operator fun get(index: Int): E
}

//Contravariant
/*
Nilai dari tipe parameter tersebut bisa dikonsumsi
dengan menjadikannya sebagai tipe argumen untuk setiap fungsi
yang ada di dalam kelas tersebut dan tidak untuk diproduksi.
*/
interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}