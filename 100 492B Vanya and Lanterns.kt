fun main() {
    val (n, l) = readLine()!!.split(" ").map { it.toInt() }
    val positions = readLine()!!.split(" ").map { it.toInt() }.sorted()

    var maxDis = 0.0

    maxDis = Math.max(maxDis, positions[0].toDouble())
    maxDis = Math.max(maxDis, (l - positions[n - 1]).toDouble())

    for (i in 1 until n) {
        val dis = (positions[i] - positions[i - 1]) / 2.0
        maxDis = Math.max(maxDis, gap)
    }

    println("%.10f".format(maxDis))
}
