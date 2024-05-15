fun main() {
    val n = readLine()!!.toInt()
    val games = readLine()!!
 
    var antonWins = 0
    var danikWins = 0
 
    for (game in games) {
        when (game) {
            'A' -> antonWins++
            'D' -> danikWins++
        }
    }
    when {
        antonWins > danikWins -> println("Anton")
        danikWins > antonWins -> println("Danik")
        else -> println("Friendship")
    }
}