fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val heights = readLine()!!.split(" ").map { it.toInt() }

    var minHeightIndex = 0
    var currentSum = heights.subList(0, k).sum()
    var minSum = currentSum

    for (i in 1..(n - k)) {
        currentSum += heights[i + k - 1] - heights[i - 1]
        if (currentSum < minSum) {
            minSum = currentSum
            minHeightIndex = i
        }
    }

    println(minHeightIndex + 1)
}
