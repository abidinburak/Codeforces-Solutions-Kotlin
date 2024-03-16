fun main() {
    val borze = readln()
    val i = borze.length
    var j = 0
    while(i-1 >= j){
        if(borze[j] == '.') print("0")
        else if(borze[j] == '-' && borze[j+1] == '.' ){
            print("1")
            j++
        } else if(borze[j] == '-' && borze[j+1] == '-' ){
            print("2")
            j++
        }
        j++
    }
}
