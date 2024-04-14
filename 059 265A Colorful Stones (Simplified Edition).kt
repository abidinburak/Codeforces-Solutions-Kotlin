fun main() {
    val s = readLine()!!  
    val t = readLine()!!  

    var position = 0  

    for (c in t) {
        if (c == s[position]) {  
            position++ 
        }
    }
    println(position + 1)  
}
