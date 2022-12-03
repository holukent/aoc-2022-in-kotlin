import java.io.File

fun main() {
    val letter = "abcdefghijklmnopqrstuvwxyz".split("",).filterNot { it == "" }
    val Letter = letter + letter.map { it.uppercase() }

    fun part1(input: String): Int {
        var result = 0
        val data = input.split("\r\n")
        for (d in data) {
            val center = d.length / 2
            val first = d.substring(0 until center)
            val second = d.substring(center until d.length)
            for (l in 0..Letter.lastIndex) {
                if (first.contains(Letter[l]) && second.contains(Letter[l])) {
                    result += (l + 1)
                }
            }
        }
        return result
    }

    fun part2(input: String): Int {
        val data = input.split("\r\n").chunked(3)
        var result = 0

        for (d in data) {
            loop@for (l in 0..Letter.lastIndex) {
                for (txt in d) {
                    if (!txt.contains(Letter[l])) {
                        continue@loop
                    }
                }
                result += (l + 1)
            }
        }
        return result
    }


    val testInput = File("src/Day03_test.txt").readText()
    check(part2(testInput) == 70)

    val input = File("src/Day03.txt").readText()
    println(part1(input))
    println(part2(input))


}