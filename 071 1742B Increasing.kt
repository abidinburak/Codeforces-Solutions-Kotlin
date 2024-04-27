fun main() {
    val t = readLine()!!.toInt() 
    for (i in 1..t) {
        val n = readLine()!!.toInt()  
        if (n % 4 != 0) {
            println("NO")
        } else {
            println("YES")
            val evenParts = (2..n step 2).joinToString(" ")  
            val oddParts = (1 until n-1 step 2).joinToString(" ") + " ${(n-1)/2*2+n/2}"  
            println("$evenParts $oddParts")
        }
    }
}
