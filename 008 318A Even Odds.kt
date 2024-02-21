fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }
    val sonuc = if (k <= (n + 1) / 2) {
        2 * k - 1
    } else {
        2 * (k - (n + 1) / 2)
    }
    println(sonuc)
}
