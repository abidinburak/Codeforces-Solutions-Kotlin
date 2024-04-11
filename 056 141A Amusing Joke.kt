fun main(args: Array<String>) {
    val guest = readLine()!!
    val host = readLine()!!
    val pile = readLine()!!
 
    if (canFormPile(guest, host, pile)) {
        println("YES")
    } else {
        println("NO")
    }
}
 
fun canFormPile(guest: String, host: String, pile: String): Boolean {
    val combined = guest + host
    if (combined.length != pile.length) {
        return false
    }
    
    val combinedCounts = combined.groupingBy { it }.eachCount()
    val pileCounts = pile.groupingBy { it }.eachCount()
    
    return combinedCounts == pileCounts
}