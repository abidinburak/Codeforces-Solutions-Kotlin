fun main() {
    val n = readln().toInt()
    var s = 0
    for(i in 0 until n){
        val ser = readln().split(" ").map { it.toInt() }
        val k = ser[0] + ser[1] + ser[2]
        if(k >= 2) s++
    }
    if(s > 0) println(s) else println(0)
}