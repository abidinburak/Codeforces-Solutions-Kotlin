import kotlin.math.min
fun main() {
    var t = readln().toInt()
    val studs = readln().split(" ").map { it.toInt() }
    val countMap = studs.groupingBy { it.toInt() }.eachCount()
    var tx = 0

    var three = countMap.getOrDefault(3, 0)
    var two = countMap.getOrDefault(2, 0)
    var one = countMap.getOrDefault(1, 0)
    var last = 0
    tx += countMap.getOrDefault(4, 0)
    if(three > 0 && one > 0){
        val minthreeone = min(three, one)
        tx += minthreeone
        three -= minthreeone
        one -= minthreeone
    }
    tx += three
    if(two % 2 == 0) {
        tx += two / 2
        two = 0
    }else{
        tx += two / 2
        two = 1
        last += 2
    }
    last += one
    if(last in 1..3)
        tx += 1
    else if(last % 4 == 0)
        tx += last / 4
    else if(last % 4 != 0)
        tx += last / 4 + 1
    println("$tx")
}
