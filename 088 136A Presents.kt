fun main() {
    val n = readLine()!!.toInt()
    val p = readLine()!!.split(" ").map { it.toInt() }
    
    val result = IntArray(n)
    
    for (i in p.indices) {
        result[p[i] - 1] = i + 1
    }
    
    println(result.joinToString(" "))
}