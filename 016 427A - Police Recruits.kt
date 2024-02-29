un main() {
    val n = readLine()!!.toInt()
    val crm = readln().split(" ")
    var oc = 0 //occurrence of a crime
    var uc = 0 //untreated crime
    var crmArr = crm.map { it.toInt() }.toMutableList()
    for (i in 0..< crmArr.size){
        if(crmArr[i] >= 1){
            uc += crmArr[i]
        }
        if(crmArr[i] == -1){
            if(uc <= 0){
                oc++
            }else{
                uc--
            }
        }
    }
println(oc)
}