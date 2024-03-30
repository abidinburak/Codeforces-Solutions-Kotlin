fun isPrm (n: Int):Boolean{
    if(n < 2) return false
    val sqrtNum = kotlin.math.sqrt(n.toDouble()).toInt()
    for (i in 2..sqrtNum){
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    val n = readln().toInt()
    for(i in n/2 downTo 4){
        if(!(isPrm(i) || isPrm(n-i))){
            println("$i ${n-i}")
            break
        }
    }
}