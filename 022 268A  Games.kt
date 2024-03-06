fun main() {
    val n = readLine()!!.toInt()
    val teams = Array(n) { Pair(0, 0) }
    var cnt = 0
    for (i in 0 until n) {
        val (h, a) = readLine()!!.split(' ').map { it.toInt() }
        teams[i] = Pair(h, a)
    }
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i != j && teams[i].first == teams[j].second) {
                cnt++
            }
        }
    }
    println(cnt)
}
