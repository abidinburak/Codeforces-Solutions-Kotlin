fun main() {
    val n = readLine()!!.toInt()
    val opinions = readLine()!!.split(" ").map { it.toInt() }
    var answer = "EASY"

    for (opinion in opinions) {
        if (opinion == 1) {
            answer = "HARD"
            break
        }
    }

    println(answer)
}
