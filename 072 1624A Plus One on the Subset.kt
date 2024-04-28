fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val array = readLine()!!.split(" ").map { it.toInt() }
        val max = array.maxOrNull() ?: 0
        var minOperations = 0
        for (element in array) {
            if (max - element > minOperations) {
                minOperations = max - element
            }
        }
        println(minOperations)
    }
}
