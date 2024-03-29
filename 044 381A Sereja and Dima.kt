fun main() {
    val n = readln().toInt()
    val cards = readln().split(" ").map { it.toInt() }.toMutableList()
    var u1 = 0
    var u2 = 0
    for (i in 0 until n) {
        val card = if (cards.first() > cards.last()) cards.removeAt(0) else cards.removeAt(cards.size - 1)
        if (i % 2 == 0) u1 += card else u2 += card
    }
    println("$u1 $u2")
}