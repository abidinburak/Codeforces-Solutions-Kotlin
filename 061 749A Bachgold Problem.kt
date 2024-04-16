fun main() {
    val n = readln().toInt()  
    if (n % 2 == 0) {
        println(n / 2)
        for (i in 1..n / 2) {
            print("2 ")
        }
    } else {
        println(n / 2)
        for (i in 1 until n / 2) { 
            print("2 ")
        }
        print("3")
    }
}