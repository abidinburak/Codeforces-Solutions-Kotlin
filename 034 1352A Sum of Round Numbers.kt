fun main() {
    val n = readln().toInt()
    for (i in 0 until n) {
        var k = 1
        var inp = readln().toInt()
        val listCases = mutableListOf<Int>()
        while (inp > 0) {
            if ((inp % 10) * k > 0) {
                listCases.add((inp % 10) * k)
            }
            inp /= 10
            k *= 10
        }
        println(listCases.size)
        for (j in listCases.indices) {
            print("${listCases[j]} ")
        }
        println("")
    }
}