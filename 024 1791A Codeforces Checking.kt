fun main() {
    val n = readln().toInt()
    val cf = "codfres"
    for(i in 0 until n){
        val l = readln()
        if(cf.contains(l)){
            println("YES")
        }else{
            println("NO")
        }
    }
}