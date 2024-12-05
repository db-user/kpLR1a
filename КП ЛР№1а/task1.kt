fun solution(number: Int): Int {
    if (number < 0) return 0

    var sum = 0
    for (i in 1 until number) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i
        }
    }
    return sum
}
fun main() {
    println(solution(10)) 
    println(solution(20))
    println(solution(-5))
}