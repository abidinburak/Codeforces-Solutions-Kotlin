

fun main() {
    val n = readln().toInt()
    for (i in 0 until n){
        val t = readln().toInt()
        var pro = 1
        var inp = readln().split(" ").map { it.toInt() }.sorted().toMutableList()
        inp[0] += 1
        for(j in inp){
            pro *= j
        }
        println(pro)
    }
}

good kid
