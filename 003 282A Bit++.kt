fun main() {
    var i = readln().toInt()
    var inp : String
    var x : Int = 0
    while (i > 0){
        inp = readln()
        when(inp[1]){
            '+' -> x++
            '-' -> x--
        }
        i--
    }
    println(x)
}