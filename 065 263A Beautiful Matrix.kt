fun main() {
    var x = 0
    var y = 0
 
    for (i in 1..5) {
        val row = readLine()!!.split(" ").map { it.toInt() }
        for (j in row.indices) {
            if (row[j] == 1) {
                x = i
                y = j + 1
                break
            }
        }
    }
 
    val moves = Math.abs(x - 3) + Math.abs(y - 3)
    println(moves)
}