fun main() {
    val bills = arrayListOf<Int>(100, 20, 10, 5, 1)
    var inp = readLine()!!.toInt()
    var cnt = 0
    for(i in bills.indices){
        cnt += inp / bills[i]
        inp %= bills[i]
    }
    println(cnt)
}