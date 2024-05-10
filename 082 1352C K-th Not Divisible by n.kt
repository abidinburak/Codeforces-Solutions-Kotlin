fun notDiv(n: Int, k: Int) {
    var x = k + k / (n - 1)
    if (k % (n - 1) == 0) x--  
    println(x)
}
 
fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (n, k) = readLine()!!.split(" ").map { it.toInt() }
        notDiv(n, k)
    }
}