fun main() {
    val inputString = readLine()!!
    val hello = "hello"
    var index = 0
 
    for (char in inputString) {
        if (char == hello[index]) {
            index++
        }
        if (index == hello.length) {
            break
        }
    }
 
    if (index == hello.length) {
        println("YES")
    } else {
        println("NO")
    }
}