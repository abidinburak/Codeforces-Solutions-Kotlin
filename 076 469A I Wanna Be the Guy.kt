fun main() {
    val n = readLine()!!.toInt()
    val levels = mutableSetOf<Int>()
    val aliceLevels = readLine()!!.split(" ").drop(1).map { it.toInt() }
    levels.addAll(aliceLevels)

    val bobLevels = readLine()!!.split(" ").drop(1).map { it.toInt() }
    levels.addAll(bobLevels)

    val totalLevels = levels.size

    if (totalLevels == n) {
        println("I become the guy.")
    } else {
        println("Oh, my keyboard!")
    }
}
