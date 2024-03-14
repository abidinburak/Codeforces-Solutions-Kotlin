fun main() {
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()
    val res = listOf<Int>(
        n1 * n2 * n3,
        n1 + n2 + n3,
        n1 * (n2 + n3),
        n3 * (n1 + n2),
        n1 * n2 + n3
         ).sortedDescending()
    println(res.first())
}