import java.io.File

fun main() {

    fun part1(input: String): Int {
        val data = input.windowed(4)
        data.forEachIndexed { index, s ->
            val temp = s.split("").filterNot { it.isBlank() }.distinct()
            if (temp.size == 4) {
                return index + 4
            }
        }
        return 0
    }

    fun part2(input: String): Int {
        val data = input.windowed(14)
        data.forEachIndexed { index, s ->
            val temp = s.split("").filterNot { it.isBlank() }.distinct()
            if (temp.size == 14) {
                return index + 14
            }
        }
        return 0
    }


    val testInput = File("src/Day06_test.txt").readText()
    check(part2(testInput) == 23)

    val input = File("src/Day06.txt").readText()
    println(part1(input))
    println(part2(input))


}