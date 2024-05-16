fun main() {
    val (n, t) = readLine()!!.split(" ").map { it.toInt() }
    var s = readLine()!!.toCharArray()
 
    repeat(t) {
        var i = 0
        while (i < s.size - 1) {
            if (s[i] == 'B' && s[i + 1] == 'G') {
                s[i] = 'G'
                s[i + 1] = 'B'
                i++ 
            }
            i++
        }
    }
 
    println(s.joinToString(""))
}