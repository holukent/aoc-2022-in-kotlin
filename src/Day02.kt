

fun main() {
    operator fun String.component1() = this[0]

    val test = ""
    test.component1()

}