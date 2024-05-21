fun main() {
    val input = readLine()!!
    val sentence = readLine()!!
 
    val alphabetSet = ('a'..'z').toSet()
    val sentenceSet = sentence.toLowerCase().toSet()
 
    if (alphabetSet.all { it in sentenceSet }) {
        println("YES")
    } else {
        println("NO")
    }
}