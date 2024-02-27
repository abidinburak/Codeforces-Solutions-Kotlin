fun main() {
        val t = readLine()!!.toInt()
        for (i in 0 until t) {
            val n = readLine()!!.toInt()
            val nums = readLine()!!.split(" ").map(String::toInt)
            val numSorted = nums.sorted()

            if(numSorted.first() == numSorted[1]) {
                println(nums.indexOf(numSorted.last()) + 1)
            } else {
                println(nums.indexOf(numSorted.first()) + 1)
            }
        }
    }