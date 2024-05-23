fun check(a: Int, b: Int, c: Int) {
    if(c > b && c > a && b > a){
        println("STAIR")
    }
    else if(a < b && b > c){
        println("PEAK")
    }
    else{
        println("NONE")
    }
}
 
fun main() {
    val n = readLine()!!.toInt()
    repeat(n){
        val(a, b, c) = readln().split(" ").map { it.toInt() }
        check(a,b,c)
    }
 
}