import java.io.File
import java.util.PriorityQueue

fun main() {
    fun part1(input: String): Int {
        val data = input.split("\r\n\r\n").map { it.lines().map { it.toInt() } }
        return data.maxOf { it.sum() }
    }

    fun part2(input: String): Int {
        val sortedSet = sortedSetOf<Int>()
        PriorityQueue<Int>()
        sortedSet.size > 3
        val data = input.split("\r\n\r\n").map { it.lines().map { it.toInt() } }
        return data.map { it.sum() }.sortedDescending().take(3).sum()
    }

    // test if implementation meets criteria from the description, like:

    val testInput = File("src/Day01_test.txt").readText()
    check(part2(testInput) == 45000)

    val input = File("src/Day01.txt").readText()
    println(part1(input))
    println(part2(input))
}
