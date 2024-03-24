fun main() {
    val n = readln().toInt()
    var cnt = 0
    val scores = readln().split(" ").map { it.toInt() }
    var maxy = scores[0]
    var miny = scores[0]
    for(i in 0 until n){
        if(scores[i] > maxy){
            cnt++
            maxy = scores[i]
        }else if (scores[i] < miny){
            cnt++
            miny = scores[i]
        }else continue
    }
    println(cnt)
}
