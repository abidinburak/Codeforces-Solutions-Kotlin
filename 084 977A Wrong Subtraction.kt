fun main() {
    var (k,n) = readln().split(" ").map { it.toInt() }
    repeat(n){
        if(k % 10 != 0){
            k--
        }else {
            k /= 10
        }
    }
    println(k)
}