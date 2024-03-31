fun main() {
    val n = readln().toInt()
    for (i in 0 until n){
        val runners = readln().split(" ").map { it.toInt() }
        val t = runners[0]
        var cnt = 0
        if(runners[1] > t) cnt++
        if (runners[2] > t) cnt++
        if (runners[3] > t) cnt++
        println(cnt)
    }

}