fun main() {
    val t = readln().toInt()
    for(i in 0 until t) {
        val users = readln().split(" ").map { it.toInt() }
        var a = users[0]
        var b = users[1]
        var c = users[2]
        a += ( b + c + 2) / 3;
        if(b % 3 > 0 && b % 3 + c < 3) a =- 1;
        println(a)
    }
}