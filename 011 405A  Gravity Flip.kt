fun main() {
    val n = readln()!!.toInt()
    val d = readLine()!!.split(' ').map { it.toInt() }.sorted()
    for (i in d.indices){
        println("${d[i]} ")
    }
}