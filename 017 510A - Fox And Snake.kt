fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    for (i in 0 until n) {
        for (j in 0 until m) {
            when {
                i % 2 == 0 -> print("#")
                i % 4 == 1 && j == m - 1 -> print("#")
                i % 4 == 3 && j == 0 -> print("#")
                else -> print(".")
            }
        }
        println()
    }
}