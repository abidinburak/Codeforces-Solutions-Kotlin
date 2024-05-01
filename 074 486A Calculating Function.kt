fun main() {
    val n = readLine()!!.toLong()
    var t = 0L

    if (n < 10) {
        for (i in 1..n) {
            if (i % 2L == 0L) {
                t += i
            } else {
                t -= i
            }
        }
    } else {
        t = if (n % 2L == 0L) n / 2 else -n / 2 - 1
    }

    println(t)
}
