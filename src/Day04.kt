import java.io.File

fun main() {

    fun part1(input: String): Int {
        val data = input.split("\r\n")
        var result = 0
        for (d in data) {
            val temp = d.split(",").map { it.split("-") }
            val first = temp[0]
            val second = temp[1]
            if (
                (first[0].toInt() <= second[0].toInt() && first[1].toInt() >= second[1].toInt()) ||
                (first[0].toInt() >= second[0].toInt() && first[1].toInt() <= second[1].toInt())
            ) {
                result++
            }
        }
        return result
    }

    fun part2(input: String): Int {
        val data = input.split("\r\n")
        var result = 0
        for (d in data) {
            val temp = d.split(",").map { it.split("-") }
            val first = temp[0].map { it.toInt() }
            val second = temp[1].map { it.toInt() }
            if (
                (first[0] in second[0]..second[1]) ||
                (first[1] in second[0]..second[1]) ||
                (second[0] in first[0]..first[1]) ||
                (second[0] in first[0]..first[1])
                )
            {
                result++
            }
        }
        return result
    }


    val testInput = File("src/Day04_test.txt").readText()
    check(part2(testInput) == 4)

    val input = File("src/Day04.txt").readText()
    println(part1(input))
    println(part2(input))

}

