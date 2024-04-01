fun main() {
    val nk = readln().split(" ").map { it.toInt() }.toList()
    val stu = readln().split(" "). map { it.toInt() }
    val n = nk[0]
    val k = nk[1]
    var tm = 0 //team members
    for(i in 0 until n){
        if(stu[i] + k <= 5){
            tm++
        }
    }
    println(tm/3)
}