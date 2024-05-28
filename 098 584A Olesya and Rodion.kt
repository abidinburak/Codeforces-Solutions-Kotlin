fun main() {
    val (n, t) = readLine()!!.split(" ").map { it.toInt() }
    
    if (t == 10 && n == 1) {
        println("-1")
    } else if (t == 10) {
        println("1" + "0".repeat(n - 1))
    } else {
        println(t.toString() + "0".repeat(n - 1))
    }
}