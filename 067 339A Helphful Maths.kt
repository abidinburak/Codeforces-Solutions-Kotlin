fun main() {
    val nSeries = readln().split("+").map { it.toInt() }
    val nSorted = nSeries.sorted()
    for (i in 0 until nSeries.size-1){
        print("${nSorted[i]}+")
    }
    println(nSorted[nSeries.size-1])
}