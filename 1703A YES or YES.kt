fun main() {
    val strLoop = readln()!!.toInt()
    var strInp : String
    for(i in 0..<strLoop){
        strInp = readln()
        val toUpperCase = strInp.uppercase()
        if(toUpperCase == "YES")
            println("YES")
        else
            println("NO")
    }
}