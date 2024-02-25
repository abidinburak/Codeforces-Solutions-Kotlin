fun main() {
    val rounds = readLine()!!.toInt()
    var mishkaWins = 0
    var chrisWins = 0
 
    repeat(rounds) {
        val (m, c) = readLine()!!.split(' ').map { it.toInt() }
        when {
            m > c -> mishkaWins++
            m < c -> chrisWins++
        }
    }
 
    when {
        mishkaWins > chrisWins -> println("Mishka")
        mishkaWins < chrisWins -> println("Chris")
        else -> println("Friendship is magic!^^")
    }
}