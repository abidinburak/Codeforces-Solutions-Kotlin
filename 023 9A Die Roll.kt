import kotlin.math.max
fun main() {
    val n = readLine()!!.split(" ").map { it.toInt() }
    val m = max(n[0], n[1])
    when{
        m == 6 -> println("1/6")
        m == 5 -> println("1/3")
        m == 4 -> println("1/2")
        m == 3 -> println("2/3")
        m == 2 -> println("5/6")
        m == 1 -> println("1/1")
    }
}