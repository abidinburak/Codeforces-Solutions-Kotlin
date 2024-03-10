fun main() {
    val t = readln().toInt()
    for(i in 0 until t){
        var sum = 0
        val n = readln().split("+").map { it.toInt() }
        sum = n[0] + n[1]
        println(sum)
    }
}
