package poo

fun sumVectors(v1: List<Int>, v2: List<Int>): List<Int> {
    if (v1.size != v2.size) throw IllegalArgumentException("As listas devem ter o mesmo tamanho")
    val result = mutableListOf<Int>()

    for (i in v1.indices)
        result.add(v1[i] + v2[i])

    return result
}

fun main() {
    val v1 = listOf(1, 2, 3)
    val v2 = listOf(4, 5, 6)
    val v3 = sumVectors(v1, v2)
    println(v3)
}
