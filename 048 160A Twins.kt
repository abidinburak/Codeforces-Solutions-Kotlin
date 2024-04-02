fun main() {
    val n = readln().toInt()
    val money = readln().split(" ").map { it.toInt() }.sortedDescending()
    var total = 0
    var cnt = 0
    if(n == 1) println("1")
    else if(n == 2){
        if(money[0] == money[1]) println("2") else println("1")
    }
    else{

    for(m in money)
        total += m
    for(i in 0 until n){
        cnt += money[i]
        if(cnt > (total - cnt)){
            println(i + 1)
            break
        }
    }
    }
}