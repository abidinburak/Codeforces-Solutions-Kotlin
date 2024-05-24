fun main() {
    val k = readLine()!!.toInt()
    val growths = readln().split(" ").map { it.toInt() }.sortedDescending()
    if (k == 0) {
        println("0")
        return
    }
    var sum = 0
    var count = 0
    for (growth in growths) {
        sum += growth
        count++
        if (sum >= k) {
            println(count)
            return
        }
    }
    println("-1")
}