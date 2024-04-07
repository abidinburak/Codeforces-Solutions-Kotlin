fun main() {
    val t = readln().toInt()
    for (i in 0 until t){
        val strinp = readln().map { it.toChar() }
        val strsize = strinp.size
        var cnt = 0
        if (strsize % 2 != 0) println("NO")
        else{
            for (j in 0 until strsize/2){
                if (strinp[j] == strinp[j+strsize/2])
                    cnt++
                else{
                    println("NO")
                    break
                }
            }
            if (cnt == strsize/2) println("YES")
        }
    }
}
