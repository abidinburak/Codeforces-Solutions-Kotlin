fun main(args: Array<String>) {
    val n = readLine()!!.toInt() // Kullanıcıdan çalışan sayısını al
    println(findLeaders(n))
}
 
fun findLeaders(n: Int): Int {
    var count = 0
    for (i in 1 until n) {
        if (n % i == 0) { // Eğer n, i ile tam bölünüyorsa, bu bir lider-çalışan gruplandırması oluşturabilir
            count++
        }
    }
    return count
}