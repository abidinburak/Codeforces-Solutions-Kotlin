fun main() {
    val n = readln().split(" ").map { it.toInt() }
    var k = n[0]
    val r = n[1]
    var i = 1
    var fn = k
    while(fn % 10 != 0 && fn % 10 != r){
        fn = k * ++i
    }
    println(i)
}