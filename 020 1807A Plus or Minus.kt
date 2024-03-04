fun main() {
    val t = readln().toInt()
    for(i in 0 until t){
        val abc = readln().split(" ").map { it.toInt() }
        if(abc[0] + abc[1] == abc[2]) println("+") else println("-")
    }
}