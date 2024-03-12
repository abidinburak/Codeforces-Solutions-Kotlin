fun main() {
    val text1 = readLine()!!
    val text2 = text1.filter { it.isLetter() }.toSet()
    println(text2.size)
}