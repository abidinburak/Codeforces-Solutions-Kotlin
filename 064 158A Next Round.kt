fun main() {
    val firstLine = readLine()!!.split(" ").map { it.toInt() }
    val n = firstLine[0]
    val k = firstLine[1]
    
    val scores = readLine()!!.split(" ").map { it.toInt() }
    val kthScore = scores[k - 1]
    val count = scores.count { it >= kthScore && it > 0 }
    
    println(count)
}
