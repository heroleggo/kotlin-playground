package part1

fun testCondition(i: Int) = i < 100

fun main() {
    var i = 0
    while (testCondition(i)) {
        print(".")
        i += 10
    }
    println()
    i = 0
    do {
        print(".")
        i += 10
    } while (testCondition(i))
    println()
    for (c in "Kotlin") {
        print("$c ")
    }
    println()
    for (j in 1..10) {
        print("$j ")
    }
}