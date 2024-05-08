
fun main() {
    val input = readLine()!!
    println(solve(input))
}

fun solve(word: String): String {
    if (word == word.toUpperCase() || (word.substring(1) == word.substring(1).toUpperCase())) {
        return word.toLowerCase()
    }
    return word
}