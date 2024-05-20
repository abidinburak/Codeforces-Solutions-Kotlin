fun main() {
    val n = readln().toInt()
    val result = StringBuilder()
    
    for (i in 1..n) {
        if (i % 2 == 1) {
            result.append("I hate")
        } else {
            result.append("I love")
        }
        if (i != n) {
            result.append(" that ")
        }
    }
    
    result.append(" it")
    println(result.toString())
}