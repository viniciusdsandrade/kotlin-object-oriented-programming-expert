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

fun removeSpace(s: String): String {

    val res = StringBuilder()

    for (c in s)
        if (c != ' ')
            res.append(c)

    return res.toString()
}

fun removeExtraSpaces(s: String): String {

    val result = StringBuilder()
    var lastChar = ' '

    for (c in s) {
        // Caso o caractere atual não seja um espaço ou o último caractere não, seja um espaço
        // então adicionamos o caractere atual ao resultado
        if (c != ' ' || lastChar != ' ') {
            result.append(c)
            lastChar = c
        }
    }

    return result.toString()
}


fun isAnagram(s1: String, s2: String): Boolean {

    // Quero uma estrutura de dados que não deixe eu adicionar elementos repetidos
    val set1 = mutableSetOf<Char>()
    val set2 = mutableSetOf<Char>()

    for (c in s1)
        if (c != ' ')
            set1.add(c.lowercaseChar())

    for (c in s2)
        if (c != ' ')
            set2.add(c.lowercaseChar())

    return set1 == set2
}

fun main() {

    // Definição de Anagrama: Anagrama é uma palavra ou frase formada pela transposição das letras de outra palavra, ou frase.
    // Exemplo: "roma", "amor", "mora", "oram", "ramo" são anagramas
    val s1 = "roma"
    val s2 = "amor"
    val s3 = "mora"
    val s4 = "oram"
    val s5 = "ramo"

    println("As strings $s1 e $s2 são anagramas? ${isAnagram(s1, s2)}")
    println("As strings $s1 e $s3 são anagramas? ${isAnagram(s1, s3)}")
    println("As strings $s1 e $s4 são anagramas? ${isAnagram(s1, s4)}")
    println("As strings $s1 e $s5 são anagramas? ${isAnagram(s1, s5)}")



    print("Digite uma string: ")
    val s = readln()

    println("A string sem espaços é: ${removeSpace(s)}")
    println("A string sem espaços extras é: ${removeExtraSpaces(s)}")



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
