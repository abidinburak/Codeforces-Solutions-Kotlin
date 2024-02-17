fun main() {
    var (m, n) = readLine()!!.split(' ')
    var mInt = m.toInt()
    var nInt = n.toInt()
    if((1 <= mInt) && (mInt <= nInt) && (nInt <= 16)){
        println(mInt * nInt / 2)
    }
}