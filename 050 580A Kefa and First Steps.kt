fun main() {
    val n = readln().toInt()
    val money = readln().split(" ").map { it.toInt() }
    var cnt = 1
    var maxi = 1
    for (i in 1 until n){
        if(money[i-1] <= money[i]){
            cnt++
        }else{
            if(cnt > maxi) maxi = cnt
            cnt = 1
        }
    }
    if(cnt > maxi) maxi = cnt
    println(maxi)
}
