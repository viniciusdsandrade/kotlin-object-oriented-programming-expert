import kotlin.math.abs

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false
    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
    }
    return true
}

fun quantityDigits(n: Int): Int {
    return n.toString().length
}

fun sumDigits(n: Int): Int {
    var sum = 0
    var number = n
    while (number != 0) {
        sum += number % 10
        number /= 10
    }
    return sum
}

fun reverseNumber(n: Int): Int {
    var reversed = 0
    var number = n
    while (number != 0) {
        val digit = number % 10
        reversed = reversed * 10 + digit
        number /= 10
    }
    return reversed
}

fun isPalindrome(n: Int): Boolean {
    return n == reverseNumber(n)
}

fun quantityDivisors(n: Int): Int {
    var quantity = 0
    for (i in 1..abs(n)) {
        if (n % i == 0) quantity++
    }
    return quantity
}

fun divisors(n: Int): List<Int> {
    val divisors = mutableListOf<Int>()
    for (i in 1..abs(n)) {
        if (n % i == 0) divisors.add(i)
    }
    return divisors
}
fun printVector(v: List<Int>){
    print("[")
    for (i in v){
        if (i == v.last()) print("$i")
        else print("$i, ")
    }
    println("]")
}


fun main(){

    println("Digite um número: ")
    val number = readln().toInt()

    if (isPrime(number)) println("$number é primo")
    else println("$number não é primo")

    println("Quantidade de dígitos: ${quantityDigits(number)}")
    println("Soma dos dígitos: ${sumDigits(number)}")
    println("Número invertido: ${reverseNumber(number)}")
    if (isPalindrome(number)) println("$number é palíndromo")
    else println("$number não é palíndromo")

    println("Quantidade de divisores: ${quantityDivisors(number)}")
    println("Divisores: ${divisors(number)}")

    printVector(divisors(number))

}





