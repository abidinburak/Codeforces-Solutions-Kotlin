fun main() {
    val n = readln().toInt()
    var status : Boolean = false
    for(i in 0 until n){
        val t = readln().toInt()
            var inp1 = readln().replace('B','G')
            var inp2 = readln().replace('B','G')
            if(inp2 == inp1) println("YES") else println("NO")
    }
}