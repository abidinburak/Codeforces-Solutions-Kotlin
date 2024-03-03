fun main() {
    val n = readLine()!!.toInt()
    val aArr = readLine()!!.split((" ")).map { it.toInt() }
    val aMax = aArr.max()
    var cnt : Int = 0
    for (i in aArr.indices){
        cnt += aMax - aArr[i]
    }
    println(cnt)

}