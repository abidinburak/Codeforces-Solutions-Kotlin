fun main() {
    val t = readln().toInt()
    for(i in 0 until t){
        val inp = readLine()!!.split(" ").map { it.toInt() }
        if(inp[0] + inp[1] >= 10)
            println("YES")
        else if (inp[0] + inp[2] >= 10)
            println("YES")
        else if (inp[1] + inp[2] >= 10)
            println("YES")
        else
            println("NO")
    }
}