fun main() {
    val username = readLine()!!
    val uniqueChars = username.toSet().size

    if (uniqueChars % 2 == 0) {
        println("CHAT WITH HER!")
    } else {
        println("IGNORE HIM!")
    }
}
