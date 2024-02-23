fun main() {
    val t = readln()!!.toInt()
    var inp : Int
    for(i in 0..<t ){
        inp = readln()!!.toInt()
        if(inp <= 1399){
            println("Division 4")
        } else if(inp <= 1599){
            println("Division 3")
        } else if (inp <= 1899){
            println("Division 2")
        }else {
            println("Division 1")
        }
    }
 
}