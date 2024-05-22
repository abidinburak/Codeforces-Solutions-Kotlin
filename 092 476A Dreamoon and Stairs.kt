fun minimumMovesToMultiple(n: Int, m: Int): Int {
    var moves = (n + 1) / 2  
    while (moves % m != 0) {
        moves += 1
    }
    return if (moves <= n) moves else -1
}

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val result = minimumMovesToMultiple(n, m)
    println(result)
}
