fun findOutlier(integers: Array<Int>): Int {
    val evenNumbers = integers.filter { it % 2 == 0 }
    val oddNumbers = integers.filter { it % 2 != 0 }
    return if (evenNumbers.size == 1) evenNumbers[0] else oddNumbers[0]
}
fun main() {
    println(findOutlier(arrayOf(2, 4, 0, 100, 4, 11, 2602, 36)))
    println(findOutlier(arrayOf(160, 3, 1719, 19, 11, 13, -21)))
}