fun main() {
    val n = readln().toInt()
    val luckyNumbers = listOf(4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777)
    for(i in luckyNumbers){
        if(n % i == 0){
            println("YES")
            return
        }
    }
    println("NO")
}