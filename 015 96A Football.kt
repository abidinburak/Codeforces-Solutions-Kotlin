fun main() {
    val fb = readln()
    var cnt = 0
    for(i in 0..< fb.length-1){
        if(fb[i] == fb[i+1]){
            cnt++
            if(cnt >= 6){
                println("YES")
                return
            }
        }else{
            cnt = 0
        }
    }
    println("NO")
}