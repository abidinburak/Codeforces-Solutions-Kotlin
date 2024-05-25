fun main() {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }
    var cnt = 0
    
    for (i in 1..n) {
        if (x % i == 0 && x / i <= n) {
            cnt++
        }
    }
    
    println(cnt)
}