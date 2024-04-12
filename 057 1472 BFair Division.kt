fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val weights = readLine()!!.split(' ').map { it.toInt() }
        if (canDivideFairly(weights)) {
            println("YES")
        } else {
            println("NO")
        }
    }
}

fun canDivideFairly(weights: List<Int>): Boolean {
    val count1 = weights.count { it == 1 }
    val count2 = weights.count { it == 2 }

    val total = count1 + 2 * count2
    if (total % 2 != 0) {
        return false
    }

    val half = total / 2
    if (half % 2 == 0 || count1 != 0) {
        return true
    }

    return false
}
