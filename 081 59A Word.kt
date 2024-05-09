fun main() {
    val s = readLine()!!
    val countUpper = s.count { it.isUpperCase() }
    val countLower = s.length - countUpper

    if (countUpper > countLower) {
        println(s.uppercase())
    } else {
        println(s.lowercase())
    }
}
