package poo

import java.text.Normalizer
import java.util.*

fun reverseString(s: String): String {
    return s.reversed()
}

fun reverseString2(s: String): String {
    var result = ""
    for (i in s.length - 1 downTo 0)
        result += s[i]

    return result
}

fun reverseString3(s: String): String {
    val arr = s.toCharArray()
    for (i in 0..<arr.size / 2) {
        val temp = arr[i]
        arr[i] = arr[arr.size - i - 1]
        arr[arr.size - i - 1] = temp
    }
    return String(arr)
}

fun isPalindrome(s: String): Boolean {
    return s == s.reversed()
}

fun isPalindrome2(s: String): Boolean {

    val normalized = Normalizer.normalize(s, Normalizer.Form.NFD)
    val withoutAccents = normalized.replace("\\p{M}".toRegex(), "")
    val withoutSpaces = withoutAccents.replace(" ", "")
    val lowerCase = withoutSpaces.lowercase(Locale.getDefault())

    return lowerCase == lowerCase.reversed()
}

fun main() {
    print("Digite uma string: ")
    val string = readln()
    println("A string invertida é: ${reverseString(string)}")
    println("A string invertida é: ${reverseString2(string)}")
    println("A string invertida é: ${reverseString3(string)}")

    if (isPalindrome(string)) println("A string é um palíndromo")
    else println("A string não é um palíndromo")

    val phrases = listOf(
        "arara",
        "Osso",
        "Subi no Ônibus",
        "Anotaram a data da maratona",
        "O galo ama o lago",
        "Ovo",
        "Essa frase não é um palíndromo"
    )

    for (phrase in phrases)
        println("\"$phrase\" é um palíndromo? ${isPalindrome(phrase)}")

    println()

    for (phrase in phrases)
        println("\"$phrase\" é um palíndromo? ${isPalindrome2(phrase)}")
}
