package exercise

import java.util.*

/*

1 - Tendo como entrada de dados a altura e o sexo de uma pessoa, construa um algoritmo que calcule o peso ideal, utilizando as seguintes fórmulas: homens: (72.7 * h) – 58    Mulheres: (62.1 * h) - 44.7
2 - Crie um algoritmo que leia quatro valores digitados pelo usuário: n, a, b, c. a) Se n = 1 imprimir os três valores a, b, c em ordem crescente.  b) Se n = 2 escrever os três valores a, b, c em ordem decrescente.  c) Se n = 3 escrever os três valores a, b, c de forma que o maior fique no meio
3 - Um posto está vendendo combustíveis com a seguinte tabela de descontos: álcool: até 20 litros, desconto de 3% por litro e acima de 20 litros, desconto de 5% por litro; gasolina: até 20 litros, desconto de 4% por litro e acima de 20 litros, desconto de 6% por litro. Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (A-álcool, G-gasolina) e imprima o valor a ser pago pelo cliente. Considere que o preço do litro da gasolina é R$ 5,39 e o preço do litro do álcool é R$ 3,39.
4 - Escreva um algoritmo para ler uma temperatura em graus Celsius, calcular e escrever o valor correspondente em graus Fahrenheit Celsius (baseado na fórmula abaixo): F = C*1.8+32
5 - Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média final é: mediafinal = (n1*2 + n2*3 + n3*5)/10
6 - A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
7 - Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
8 - O proprietário da empresa ABC LTDA precisa de um software para calcular o novo salário que seus funcionários irão receber a partir do próximo mês. Sabendo que o aumento de salário para todos os funcionários será de 25%, faça um programa que lê o valor do salário atual do funcionário e informa o seu novo salário acrescido de 25%.
9 - Crie um programa que lê o ano de nascimento de uma pessoa e o ano atual. Calcule e mostre qual é: a idade da pessoa em anos, a idade da pessoa em meses, a idade da pessoa em dias e a idade da pessoa em semanas.
10 - Elaborar um programa que calcule e apresente o valor do volume de uma caixa retangular, utilizando a fórmula VOLUME ← COMPRIMENTO * LARGURA * ALTURA.

Exercícios de Laço de Repetição

11. Faça um programa em C que mostre a tabuada de qualquer número escolhido pelo usuário (considerar tabuada do número 1 ao 10).
12. A prefeitura de uma cidade fez uma pesquisa com 200 pessoas, coletando dados sobre o salário e o número de filhos. A prefeitura deseja saber: • A média do salário dessas pessoas • A média do número de filhos • O maior salário
13. A série de Fibonacci é formada pela seguinte sequência: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, etc. Escreva um algoritmo que gere a série de Fibonacci até o vigésimo termo.

Exercícios de Funções

14. Faça um programa em C que calcule a média de um aluno. Utilize uma função média: A própria função deve apresentar a média do aluno.
15. Faça um programa em C que apresente funções para as quatro operações: Somar, Subtrair, Multiplicar e Dividir.
16. Faça um programa que apresente função para calcular a área de uma circunferência. A função deve calcular a área e realizar o retorno para a função principal. Area = 3.14*(R*R).
17. aça um programa que apresente função para calcular o IMC. A função deve retornar o IMC calculado para a função principal. IMC = peso/(altura*altura);
18. Faça um programa para calcular salário do funcionário. A função deve retornar o salário para a função principal. Salario = (hora * valorhora)*dias;
19. Faça um programa que crie uma função ordena. A função deve preencher um vetor de 10 posições e apresentar os valores ordenados.
20. Faça um programa que calcule a média de um aluno. Usar função media passando duas notas como parâmetro.
21. Faça um programa que converta graus Fahrenheit para Celsius. Usar a função Celsius recebendo o grau Fahrenheit como parâmetro. Fórmula para cálculo: C=(F-32)/1.8.

 */

// Exercício 1: Peso Ideal
private fun exercicio1PesoIdeal() {
    println("\nExercício 1: Peso Ideal")
    print("Digite sua altura (em metros): ")
    val altura = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite seu sexo (M/F): ")
    val sexo = readlnOrNull()?.uppercase(Locale.getDefault()) ?: return

    val pesoIdeal = when (sexo) {
        "M" -> (72.7 * altura) - 58
        "F" -> (62.1 * altura) - 44.7
        else -> {
            println("Sexo inválido!")
            return
        }
    }
    println("Seu peso ideal é: %.2f kg".format(pesoIdeal))
}

// Exercício 2: Ordenação de Valores
private fun exercicio2OrdenacaoValores() {
    println("\nExercício 2: Ordenação de Valores")
    print("Digite o valor de n (1, 2 ou 3): ")
    val n = readlnOrNull()?.toIntOrNull() ?: return

    print("Digite o valor de a: ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite o valor de b: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite o valor de c: ")
    val c = readlnOrNull()?.toDoubleOrNull() ?: return

    when (n) {
        1 -> {
            val ordemCrescente = listOf(a, b, c).sorted()
            println("Ordem crescente: $ordemCrescente")
        }
        2 -> {
            val ordemDecrescente = listOf(a, b, c).sortedDescending()
            println("Ordem decrescente: $ordemDecrescente")
        }
        3 -> {
            // Ordena para que o maior fique no meio
            val sortedList = listOf(a, b, c).sorted()
            val novaOrdem = listOf(sortedList[0], sortedList[2], sortedList[1])
            println("Maior no meio: $novaOrdem")
        }
        else -> println("Valor de n inválido.")
    }
}

// Exercício 3: Combustíveis com Descontos
private fun exercicio3Combustiveis() {
    println("\nExercício 3: Combustíveis com Descontos")
    print("Digite o número de litros vendidos: ")
    val litros = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite o tipo de combustível (A-álcool, G-gasolina): ")
    val tipo = readlnOrNull()?.uppercase(Locale.getDefault()) ?: return

    val (preco, descontoPercentual) = when (tipo) {
        "A" -> 3.39 to if (litros <= 20) 0.03 else 0.05
        "G" -> 5.39 to if (litros <= 20) 0.04 else 0.06
        else -> {
            println("Tipo de combustível inválido!")
            return
        }
    }
    val valorTotal = litros * preco
    val desconto = valorTotal * descontoPercentual
    val valorAPagar = valorTotal - desconto

    println("Valor a ser pago: R$ %.2f".format(valorAPagar))
}

// Exercício 4: Conversão Celsius para Fahrenheit
private fun exercicio4CelsiusParaFahrenheit() {
    println("\nExercício 4: Conversão Celsius para Fahrenheit")
    print("Digite a temperatura em graus Celsius: ")
    val celsius = readlnOrNull()?.toDoubleOrNull() ?: return
    val fahrenheit = celsius * 1.8 + 32
    println("$celsius °C equivalem a $fahrenheit °F")
}

// Exercício 5: Média Ponderada de Três Notas
private fun exercicio5MediaPonderada() {
    println("\nExercício 5: Média Ponderada de Três Notas")
    print("Digite a primeira nota: ")
    val n1 = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite a segunda nota: ")
    val n2 = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite a terceira nota: ")
    val n3 = readlnOrNull()?.toDoubleOrNull() ?: return

    val mediaFinal = (n1 * 2 + n2 * 3 + n3 * 5) / 10
    println("Média final do aluno: %.2f".format(mediaFinal))
}

// Exercício 6: Salário com Hora Extra
private fun exercicio6SalarioExtra() {
    println("\nExercício 6: Salário com Hora Extra")
    print("Digite o número de horas trabalhadas no mês: ")
    val horasTrabalhadas = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite o salário por hora: ")
    val salarioHora = readlnOrNull()?.toDoubleOrNull() ?: return

    val jornadaMensal = 40 * 4 // 160 horas mensais
    val salarioTotal = if (horasTrabalhadas > jornadaMensal) {
        val horasExtras = horasTrabalhadas - jornadaMensal
        (jornadaMensal * salarioHora) + (horasExtras * salarioHora * 1.5)
    } else {
        horasTrabalhadas * salarioHora
    }
    println("Salário total: R$ %.2f".format(salarioTotal))
}

// Exercício 7: Cálculo do Saldo Atual da Conta
private fun exercicio7SaldoConta() {
    println("\nExercício 7: Cálculo do Saldo Atual da Conta")
    print("Digite o número da conta: ")
    val numeroConta = readlnOrNull() ?: return
    print("Digite o saldo: ")
    val saldo = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite o débito: ")
    val debito = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite o crédito: ")
    val credito = readlnOrNull()?.toDoubleOrNull() ?: return

    val saldoAtual = saldo - debito + credito
    println("Saldo atual: R$ %.2f".format(saldoAtual))
    if (saldoAtual >= 0)
        println("Saldo Positivo")
    else
        println("Saldo Negativo")
}

// Exercício 8: Novo Salário com Aumento de 25%
private fun exercicio8NovoSalario() {
    println("\nExercício 8: Novo Salário com Aumento de 25%")
    print("Digite o salário atual: ")
    val salarioAtual = readlnOrNull()?.toDoubleOrNull() ?: return
    val novoSalario = salarioAtual * 1.25
    println("Novo salário: R$ %.2f".format(novoSalario))
}

// Exercício 9: Cálculo de Idade (Anos, Meses, Dias e Semanas)
private fun exercicio9CalcularIdade() {
    println("\nExercício 9: Cálculo de Idade (Anos, Meses, Dias e Semanas)")
    print("Digite o ano de nascimento: ")
    val anoNascimento = readlnOrNull()?.toIntOrNull() ?: return
    print("Digite o ano atual: ")
    val anoAtual = readlnOrNull()?.toIntOrNull() ?: return

    val idadeAnos = anoAtual - anoNascimento
    val idadeMeses = idadeAnos * 12
    val idadeDias = idadeAnos * 365   // aproximação
    val idadeSemanas = idadeAnos * 52  // aproximação

    println("Idade em anos: $idadeAnos")
    println("Idade em meses: $idadeMeses")
    println("Idade em dias: $idadeDias")
    println("Idade em semanas: $idadeSemanas")
}

// Exercício 10: Volume de uma Caixa Retangular
private fun exercicio10VolumeCaixa() {
    println("\nExercício 10: Volume de uma Caixa Retangular")
    print("Digite o comprimento: ")
    val comprimento = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite a largura: ")
    val largura = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite a altura: ")
    val altura = readlnOrNull()?.toDoubleOrNull() ?: return

    val volume = comprimento * largura * altura
    println("O volume da caixa retangular é: $volume")
}

// Exercício 11: Tabuada de um Número
private fun exercicio11Tabuada() {
    println("\nExercício 11: Tabuada de um Número")
    print("Digite um número para ver sua tabuada: ")
    val num = readlnOrNull()?.toIntOrNull() ?: return
    for (i in 1..10) {
        println("$num x $i = ${num * i}")
    }
}

// Exercício 12: Pesquisa da Prefeitura (200 Pessoas)
private fun exercicio12PesquisaPrefeitura() {
    println("\nExercício 12: Pesquisa da Prefeitura (200 Pessoas)")
    val totalPessoas = 200
    var somaSalarios = 0.0
    var somaFilhos = 0
    var maiorSalario = 0.0

    for (i in 1..totalPessoas) {
        println("\nPessoa $i:")
        print("Digite o salário: ")
        val salario = readlnOrNull()?.toDoubleOrNull() ?: continue
        print("Digite o número de filhos: ")
        val filhos = readlnOrNull()?.toIntOrNull() ?: 0

        somaSalarios += salario
        somaFilhos += filhos
        if (salario > maiorSalario) {
            maiorSalario = salario
        }
    }
    val mediaSalario = somaSalarios / totalPessoas
    val mediaFilhos = somaFilhos.toDouble() / totalPessoas

    println("\nMédia dos salários: R$ %.2f".format(mediaSalario))
    println("Média do número de filhos: %.2f".format(mediaFilhos))
    println("Maior salário: R$ %.2f".format(maiorSalario))
}

// Exercício 13: Série de Fibonacci (20 termos)
private fun exercicio13Fibonacci() {
    println("\nExercício 13: Série de Fibonacci (20 termos)")
    val termos = 20
    var a = 1
    var b = 1
    print("$a, $b")
    for (i in 3..termos) {
        val c = a + b
        print(", $c")
        a = b
        b = c
    }
    println()
}

// Exercício 14: Média de um Aluno (Três Notas) utilizando função
private fun exercicio14MediaAluno() {
    println("\nExercício 14: Média de um Aluno (Três Notas)")
    fun calcularMedia(n1: Double, n2: Double, n3: Double) {
        val media = (n1 + n2 + n3) / 3
        println("A média do aluno é: %.2f".format(media))
    }
    print("Digite a primeira nota: ")
    val nota1 = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite a segunda nota: ")
    val nota2 = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite a terceira nota: ")
    val nota3 = readlnOrNull()?.toDoubleOrNull() ?: return

    calcularMedia(nota1, nota2, nota3)
}

// Exercício 15: Funções para as Quatro Operações Básicas
private fun exercicio15Operacoes() {
    println("\nExercício 15: Operações Básicas")
    fun somar(a: Double, b: Double): Double = a + b
    fun subtrair(a: Double, b: Double): Double = a - b
    fun multiplicar(a: Double, b: Double): Double = a * b
    fun dividir(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("Divisão por zero não é permitida")
        }
        return a / b
    }
    print("Digite o primeiro número: ")
    val num1 = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite o segundo número: ")
    val num2 = readlnOrNull()?.toDoubleOrNull() ?: return

    println("Soma: ${somar(num1, num2)}")
    println("Subtração: ${subtrair(num1, num2)}")
    println("Multiplicação: ${multiplicar(num1, num2)}")
    try {
        println("Divisão: ${dividir(num1, num2)}")
    } catch (e: Exception) {
        println(e.message)
    }
}

// Exercício 16: Área de uma Circunferência
private fun exercicio16AreaCircunferencia() {
    println("\nExercício 16: Área de uma Circunferência")
    fun calcularAreaCircunferencia(raio: Double): Double {
        return 3.14 * (raio * raio)
    }
    print("Digite o raio da circunferência: ")
    val raio = readlnOrNull()?.toDoubleOrNull() ?: return
    val area = calcularAreaCircunferencia(raio)
    println("A área da circunferência é: %.2f".format(area))
}

// Exercício 17: Calcular o IMC
private fun exercicio17CalcularIMC() {
    println("\nExercício 17: Calcular o IMC")
    fun calcularIMC(peso: Double, altura: Double): Double {
        return peso / (altura * altura)
    }
    print("Digite o peso (kg): ")
    val peso = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite a altura (m): ")
    val altura = readlnOrNull()?.toDoubleOrNull() ?: return

    val imc = calcularIMC(peso, altura)
    println("O IMC é: %.2f".format(imc))
}

// Exercício 18: Calcular Salário do Funcionário
private fun exercicio18CalcularSalario() {
    println("\nExercício 18: Calcular Salário do Funcionário")
    fun calcularSalario(horas: Double, valorHora: Double, dias: Int): Double {
        return horas * valorHora * dias
    }
    print("Digite o número de horas trabalhadas por dia: ")
    val horas = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite o valor da hora: ")
    val valorHora = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite o número de dias trabalhados: ")
    val dias = readlnOrNull()?.toIntOrNull() ?: return

    val salario = calcularSalario(horas, valorHora, dias)
    println("O salário do funcionário é: R$ %.2f".format(salario))
}

// Exercício 19: Ordenar Vetor de 10 Posições
private fun exercicio19OrdenaVetor() {
    println("\nExercício 19: Ordenar Vetor de 10 Posições")
    fun ordenarVetor(vetor: IntArray): IntArray {
        return vetor.sortedArray()
    }
    val vetor = IntArray(10)
    println("Digite 10 números:")
    for (i in vetor.indices) {
        print("Número ${i + 1}: ")
        vetor[i] = readlnOrNull()?.toIntOrNull() ?: 0
    }
    val vetorOrdenado = ordenarVetor(vetor)
    println("Vetor ordenado: ${vetorOrdenado.joinToString(", ")}")
}

// Exercício 20: Média de um Aluno (Duas Notas)
private fun exercicio20MediaAlunoDuasNotas() {
    println("\nExercício 20: Média de um Aluno (Duas Notas)")
    fun calcularMedia2(nota1: Double, nota2: Double): Double {
        return (nota1 + nota2) / 2
    }
    print("Digite a primeira nota: ")
    val nota1 = readlnOrNull()?.toDoubleOrNull() ?: return
    print("Digite a segunda nota: ")
    val nota2 = readlnOrNull()?.toDoubleOrNull() ?: return

    val media = calcularMedia2(nota1, nota2)
    println("A média do aluno é: %.2f".format(media))
}

// Exercício 21: Converter Fahrenheit para Celsius
private fun exercicio21FahrenheitParaCelsius() {
    println("\nExercício 21: Converter Fahrenheit para Celsius")
    fun fahrenheitParaCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32) / 1.8
    }
    print("Digite a temperatura em Fahrenheit: ")
    val fahrenheit = readlnOrNull()?.toDoubleOrNull() ?: return
    val celsius = fahrenheitParaCelsius(fahrenheit)
    println("$fahrenheit °F equivalem a %.2f °C".format(celsius))
}

// Função principal com menu
fun main() {
    while (true) {
        println(
            """
            --- Menu de Exercícios ---
            1.  Peso Ideal
            2.  Ordenação de Valores
            3.  Combustíveis com Descontos
            4.  Conversão Celsius para Fahrenheit
            5.  Média Ponderada de Três Notas
            6.  Salário com Hora Extra
            7.  Cálculo do Saldo Atual da Conta
            8.  Novo Salário com Aumento de 25%
            9.  Cálculo de Idade (Anos, Meses, Dias e Semanas)
            10. Volume de uma Caixa Retangular
            11. Tabuada de um Número
            12. Pesquisa da Prefeitura (200 Pessoas)
            13. Série de Fibonacci (20 termos)
            14. Média de um Aluno (Três Notas)
            15. Operações Básicas
            16. Área de uma Circunferência
            17. Calcular o IMC
            18. Calcular Salário do Funcionário
            19. Ordenar Vetor de 10 Posições
            20. Média de um Aluno (Duas Notas)
            21. Converter Fahrenheit para Celsius
            0.  Sair
            """.trimIndent()
        )
        print("Escolha um exercício: ")
        val opcao = readlnOrNull()?.toIntOrNull() ?: continue

        when (opcao) {
            1  -> exercicio1PesoIdeal()
            2  -> exercicio2OrdenacaoValores()
            3  -> exercicio3Combustiveis()
            4  -> exercicio4CelsiusParaFahrenheit()
            5  -> exercicio5MediaPonderada()
            6  -> exercicio6SalarioExtra()
            7  -> exercicio7SaldoConta()
            8  -> exercicio8NovoSalario()
            9  -> exercicio9CalcularIdade()
            10 -> exercicio10VolumeCaixa()
            11 -> exercicio11Tabuada()
            12 -> exercicio12PesquisaPrefeitura()
            13 -> exercicio13Fibonacci()
            14 -> exercicio14MediaAluno()
            15 -> exercicio15Operacoes()
            16 -> exercicio16AreaCircunferencia()
            17 -> exercicio17CalcularIMC()
            18 -> exercicio18CalcularSalario()
            19 -> exercicio19OrdenaVetor()
            20 -> exercicio20MediaAlunoDuasNotas()
            21 -> exercicio21FahrenheitParaCelsius()
            0  -> {
                println("Encerrando o programa.")
                return
            }
            else -> println("Opção inválida! Tente novamente.")
        }
        println("\nPressione Enter para voltar ao menu...")
        readlnOrNull()
    }
}