package part1

fun main() {
    val result = if (99 < 100) 4 else 42
    println(result)

    val activity = "swimming"
    val hour = 10

    val isOpen = if (
        activity == "swimming" ||
        activity == "ice skating") {
        val opens = 9
        val closes = 20
        println("Operating hours : " + opens + " - " + closes)
        hour >= opens && hour <= closes
    } else {
        false
    }
    println(isOpen)
}