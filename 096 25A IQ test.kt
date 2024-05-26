fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }

    var oddCount = 0
    var evenCount = 0
    var oddIndex = -1
    var evenIndex = -1

    for (i in numbers.indices) {
        if (numbers[i] % 2 == 0) {
            evenCount++
            evenIndex = i + 1
        } else {
            oddCount++
            oddIndex = i + 1
        }
    }

    if (oddCount == 1) {
        println(oddIndex)
    } else {
        println(evenIndex)
    }
}
