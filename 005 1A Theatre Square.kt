fun main() {
    var (m, n, a) = readLine()!!.split(' ')
    var mInt = m.toLong()
    var nInt = n.toLong()
    var aInt = a.toLong()
    var h: Long
    var v: Long
    h = nInt / aInt
    if (nInt % aInt != 0.toLong()) {
        h++
    }
    v = mInt / aInt
    if (mInt % aInt != 0.toLong()) {
        v++
    }
    println(h * v)
}