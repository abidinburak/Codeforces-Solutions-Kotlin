fun main() {
    val n = readLine()!!.toInt()
    val goals = mutableMapOf<String, Int>()
 
    repeat(n) {
        val team = readLine()!!
        goals[team] = goals.getOrDefault(team, 0) + 1
    }
 
    var maxGoalsTeam = ""
    var maxGoals = 0
    for ((team, goalCount) in goals) {
        if (goalCount > maxGoals) {
            maxGoals = goalCount
            maxGoalsTeam = team
        }
    }
 
    println(maxGoalsTeam)
}