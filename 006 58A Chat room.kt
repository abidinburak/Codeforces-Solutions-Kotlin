fun main() {
    val s = readLine()!!
    var helloIndex = 0
    val hello = "hello"

    for (char in s) {
        if (helloIndex < hello.length && char == hello[helloIndex]) {
            helloIndex++
        }
    }

    if (helloIndex == hello.length) {
        println("YES")
    } else {
        println("NO")
    }
}