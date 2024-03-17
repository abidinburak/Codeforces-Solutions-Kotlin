fun main() {
    val n = readln().toInt()
    for(i in 0 until n){
        val abc = readln()
        var cnt = 0
        if((abc[0] == 'a'))
            println("YES")
        else if((abc[0] == 'b') && (abc[1] == 'a'))
            println("YES")
        else if ((abc[0] == 'c') && (abc[1] == 'b'))
            println("YES")
        else
            println("NO")
    }
}
