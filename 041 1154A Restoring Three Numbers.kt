fun main() {
    val n = readln().split(" ").map{it.toInt()}.sortedDescending()
    val abc = n[0]
    val ab = n[1]
    val ac = n[2]
    val bc = n[3]
    val c = abc - ab
    val b = abc - ac
    val a = abc - bc
println("$a $b $c")
}