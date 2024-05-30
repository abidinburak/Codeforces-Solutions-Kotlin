fun main() {
    val t = readln().toInt()
    repeat(t) {
        val angle = readln().toInt()
        if (360 % (180 - angle) == 0) {
            println("YES")
        } else {
            println("NO")
        }
    }
}