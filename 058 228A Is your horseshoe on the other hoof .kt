fun main() {
    val colors = readLine()!!.split(' ').map { it.toInt() }.toSet()
    println(4 - colors.size) 
}
