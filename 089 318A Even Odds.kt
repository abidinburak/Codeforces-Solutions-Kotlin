fun main() {
    val input = readLine()!!.split(" ")
    val n = input[0].toLong()
    val k = input[1].toLong()
    
    val numOdds = (n + 1) / 2
    val result = if (k <= numOdds) {
        2 * k - 1
    } else {
        2 * (k - numOdds)
    }
    println(result)
}