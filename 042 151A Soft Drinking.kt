//import kotlin.math.min
fun main() {
    val inf = readln().split(" ").map{it.toInt()}
    val n = inf[0]
    val k = inf[1]
    val l = inf[2]
    val c = inf[3]
    val d = inf[4]
    val p = inf[5]
    val nl = inf[6]
    val np = inf[7]
    val td = k * l //total drinks
    val toasts = td / nl
    val lemon = c * d
    val salt = p / np
    val fnl = min(toasts,min(lemon,salt))
    //println("fnl = $fnl, toasts = $toasts, lemon = $lemon, salt = $salt")
    println(fnl / n)
}