fun main() {
    val n = readLine()!!.toInt()
    var count = 0 
 
    for (i in 1..n) {
        val (p, q) = readLine()!!.split(" ").map { it.toInt() }
        if (q - p >= 2) { 
            count++ 
        }
    }
 
    println(count) 
}