
fun main() {
   val str = readln()
    var t = 0
    for (l in str){
        if (l == 'H' || l == 'Q' || l == '9') {
            println("YES")
            t = 0
            break
        }else t++
    }
    if(t > 0) println("NO")
}
