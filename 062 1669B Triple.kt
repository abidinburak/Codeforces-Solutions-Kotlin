fun main() {
    val t = readLine()!!.toInt() 
 
    for (case in 1..t) {
        val n = readLine()!!.toInt() 
        val elements = readLine()!!.split(" ").map { it.toInt() }
 
        val countMap = mutableMapOf<Int, Int>()
        var answer = -1
 
        for (element in elements) {
            val count = countMap.getOrDefault(element, 0) + 1
            countMap[element] = count
            
            if (count == 3) {
                answer = element
                break
            }
        }
        println(answer)
    }
}