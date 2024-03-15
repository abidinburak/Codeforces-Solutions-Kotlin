
fun main() {
    val n = readln().toInt()
    for(i in 0 until n){
        val str = readln()
        var cntA = 0
        var cntB = 0
        for(j in 0 until 5){
            if(str[j] == 'A') cntA++ else cntB++
        }
        if(cntA > cntB) println("A") else println("B")
    }
}