fun main() {
    val n = readLine()!!.toInt()
    val array = readLine()!!.split(" ").map { it.toInt() }
    var maxLength = 1
    var currentLength = 1

    for (i in 1 until n) {
        if (array[i] > array[i - 1]) {
            currentLength++
            maxLength = maxOf(maxLength, currentLength)
        } else {
            currentLength = 1
        }
    }

    println(maxLength)
}
