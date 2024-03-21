import kotlin.math.max
import kotlin.math.min
fun main() {
    val t = readln().toInt()
    for(i in 0 until t){
        val sides = readln().split(" ").map { it.toInt() }
        val minSide = min(sides[0], sides[1])
        val maxSide = max(sides[0], sides[1])
        if(minSide * 2 >= maxSide) println((minSide*2)*(minSide*2)) else println(maxSide*maxSide)
    }
}
