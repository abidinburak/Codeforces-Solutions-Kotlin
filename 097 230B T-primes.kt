fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toLong() }
 
    val maxNumber = numbers.maxOrNull() ?: 0L
    val maxCheck = Math.sqrt(maxNumber.toDouble()).toLong() + 1
 
    val isPrime = BooleanArray(maxCheck.toInt() + 1) { true }
    isPrime[0] = false
    isPrime[1] = false
 
    for (i in 2..maxCheck) {
        if (isPrime[i.toInt()]) {
            var j = i * i
            while (j <= maxCheck) {
                isPrime[j.toInt()] = false
                j += i
            }
        }
    }
 
    for (number in numbers) {
        val sqrt = Math.sqrt(number.toDouble()).toLong()
        if (sqrt * sqrt == number && isPrime[sqrt.toInt()]) {
            println("YES")
        } else {
            println("NO")
        }
    }
}