fun main() {
    val input = readLine()!!.split(" ")
    val n = input[0].toInt()
    val h = input[1].toInt()

    val heights = readLine()!!.split(" ").map { it.toInt() }

    var width = 0
    for (height in heights) {
        if (height > h) {
            width += 2
        } else {
            width++
        }
    }
    println(width)
}
