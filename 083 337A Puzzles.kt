fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }  
    val f = readln().split(" ").map { it.toInt() }.sorted() 

    var minDifference = Int.MAX_VALUE
    for (i in 0..m-n) {  
        val diff = f[i+n-1] - f[i]  
        if (diff < minDifference) {
            minDifference = diff  
        }
    }

    println(minDifference) 
}
