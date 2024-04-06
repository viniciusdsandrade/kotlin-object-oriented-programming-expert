fun printMatrix(matrix: List<List<Int>>) {
    for (row in matrix) {
        print("[ ")
        for (i in row){
            print("$i ")
        }
        println("]")
    }
}


fun main() {
    val matrix = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

    printMatrix(matrix)
}
