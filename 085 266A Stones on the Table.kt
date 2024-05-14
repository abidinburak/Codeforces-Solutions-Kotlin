fun main() {
    var n = readln()!!.toInt()
    var x = 0
    var clr = readln()
    for(i in 0 until n-1){
        if(clr[i] == clr[i+1]){
            x++
        }
    }
    println(x)
 
}