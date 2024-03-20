import kotlin.math.max
fun main() {
    val n = readln().toInt()
    for (i in 0 until n) {
       val inp = readln().split(" ").map { it.toInt() }
        if(inp[0] > inp[1] && inp[0] > inp[2]){
            println(max(inp[1],inp[2]))
        }
        else if(inp[1] > inp[0] && inp[1] > inp[2]){
            println(max(inp[0],inp[2]))
        }
        else {
            println(max(inp[0],inp[1]))
        }
    }
}