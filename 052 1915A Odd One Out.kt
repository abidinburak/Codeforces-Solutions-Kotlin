fun main() {
    val t = readln().toInt()
    for (i in 0 until t){
        val abc = readln().split(" ").map { it.toInt() }
        val a = abc[0]
        val b = abc[1]
        val c = abc[2]
        if(a == b){
            println(c)
        }else if(a == c){
            println(b)
        }else
            println(a)
    }
}
