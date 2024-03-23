fun main() {
    val t = readln().toInt()
    for(i in 0 until t){
        var n = readln().toInt()
        if(n <= 2) println("0")
        else if(n == 3 || n == 4 ) println("1")
        else if(n % 2 == 0) println((n / 2) - 1)
        else println(n / 2)
    }
}