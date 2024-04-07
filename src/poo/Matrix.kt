package poo

fun printMatrix(matrix: List<List<Int>>) {
    for (row in matrix) {
        print("[ ")
        for (i in row)
            print("$i ")
        println("]")
    }
}

fun transposeMatrix(matrix: List<List<Int>>): List<List<Int>> {
    val result = mutableListOf<MutableList<Int>>()

    for (i in matrix[0].indices) {
        val row = mutableListOf<Int>()
        for (j in matrix.indices)
            row.add(matrix[j][i])
        result.add(row)
    }
    return result
}

fun main() {
    val matrix = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )
    printMatrix(matrix)

    println()
    val matrixTranspose = transposeMatrix(matrix)
    printMatrix(matrixTranspose)
}
