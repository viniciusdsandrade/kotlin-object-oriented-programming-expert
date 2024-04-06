fun main() {
    println("Hello World!")

    // This is a comment

    // Quero fazer uma entrada de dados
    print("Digite um número: ")
    val number = readln().toInt()

    // Quero verificar se o número é primo
    if (isPrime(number)) println("$number é primo")
    else println("$number não é primo")


}