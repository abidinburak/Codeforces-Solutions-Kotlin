fun main() {
    val n = readln().toInt()
    var cnt0 : Int = 0
    var cnt1 : Int = 0
    var cnt2 : Int = 0
    for(i in 0 until n){
        val arr = readln().split(" ").map { it.toInt() }
        cnt0 += arr[0]
        cnt1 += arr[1]
        cnt2 += arr[2]
    }
    if(cnt0 == 0 && cnt1 == 0 && cnt2 == 0) println("YES") else println("NO")

}