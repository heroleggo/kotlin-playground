package part1

fun main() {
    val n = 1000 // int
    val l = 1000L // long
    val f = 1000.0 // float

    println("$n $l $f")

    println(Int.MAX_VALUE + 1) // overflow detected
    println(Int.MAX_VALUE + 1L) // convert to long

    val d1: Double = 3.0 + 2 / 5
    val d2: Double = 3 + 2.0 / 5
    println(d1)
    println(d2)
}