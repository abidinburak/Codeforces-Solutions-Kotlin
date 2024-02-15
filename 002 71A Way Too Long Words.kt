fun main() {
    val i = readln().toInt() //You can use Integer.valueOf(readLine()) 
    var j : Int = 0
    while (j < i){
        j++
        val wordin = readLine()
        if((wordin!!.length) <= 10) {
            println("${wordin}")
        } else {
            println("${wordin.first()}${wordin!!.length-2}${wordin.last()}")
        }
    }
}