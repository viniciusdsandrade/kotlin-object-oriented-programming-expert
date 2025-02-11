package algorithms.lista8

/*

Recursão

1. Escreva um algoritmo iterativo em C para avaliar a * b usando a adição, onde a e b são
inteiros não negativos.

2. Escreva uma definição recursiva para o cálculo de a * b e em seguida escreva um algoritmo
recursivo para o cálculo de a * b, onde a e b são inteiros não-negativos.

3. Faça uma função recursiva em C que calcula o elemento máximo em um vetor.

4. Faça uma função recursiva em C que calcula o elemento mínimo em um vetor.

5. Faça uma função recursiva em C que calcula a média dos elementos de um vetor.

6. Faça uma representação da memória do computador considerando as chamadas das funções
recursivas abaixo (vistas em aula). Faça um modelo passo a passo como nos exemplos visto
em sala de aula:
    • fatorial(6)
    • fibonacci(5)

7. Determine o que a seguinte definição recursiva para uma função f calcula. A definição da
função f é dada abaixo:
    • Se n == 0 retorne 0.
    • Se n > 0 retorne n + f(n − 1).
 */

fun multiplicacao(a: Int, b: Int): Int {
    var result = 0
    for (i in 0..<b) {
        result += a
    }
    return result
}

fun multiplicacaoRecursiva(a: Int, b: Int): Int {
    if (b == 0) return 0
    return a + multiplicacaoRecursiva(a, b - 1)
}

fun maximo(vetor: IntArray): Int {
    return maximo(vetor, 0, vetor.size - 1)
}

fun maximo(vetor: IntArray, inicio: Int, fim: Int): Int {
    if (inicio == fim) return vetor[inicio]
    val meio = (inicio + fim) / 2
    val max1 = maximo(vetor, inicio, meio)
    val max2 = maximo(vetor, meio + 1, fim)
    return if (max1 > max2) max1 else max2
}

fun minimo(vetor: IntArray): Int {
    return minimo(vetor, 0, vetor.size - 1)
}

fun minimo(vetor: IntArray, inicio: Int, fim: Int): Int {
    if (inicio == fim) return vetor[inicio]
    val meio = (inicio + fim) / 2
    val min1 = minimo(vetor, inicio, meio)
    val min2 = minimo(vetor, meio + 1, fim)
    return if (min1 < min2) min1 else min2
}

fun media(vetor: IntArray): Double {
    return media(vetor, 0, vetor.size - 1)
}

fun media(vetor: IntArray, inicio: Int, fim: Int): Double {
    if (inicio == fim) return vetor[inicio].toDouble()
    val meio = (inicio + fim) / 2
    val media1 = media(vetor, inicio, meio)
    val media2 = media(vetor, meio + 1, fim)
    return (media1 + media2) / 2
}


fun main() {
    println(multiplicacao(5, 5))
    println(multiplicacaoRecursiva(5, 5))
    println(maximo(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
    println(minimo(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
    println(media(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
}
