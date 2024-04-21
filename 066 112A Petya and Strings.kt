fun main() {
    val str1 = readLine()!!.toLowerCase()
    val str2 = readLine()!!.toLowerCase()
 
    val result = when {
        str1 < str2 -> -1
        str1 > str2 -> 1
        else -> 0
    }
 
    println(result)
}