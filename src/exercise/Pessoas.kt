package exercise

class Pessoas {
    private var nome: String = ""
    private var idade: Int = 0
    private var peso: Double = 0.0
    private var altura: Double = 0.0

    fun cadastrarNome(nome: String) {
        this.nome = nome
    }

    fun mostrarNome(): String {
        return nome
    }

    fun cadastrarIdade(idade: Int) {
        this.idade = idade
    }

    fun mostrarIdade(): Int {
        return idade
    }

    fun cadastrarPeso(peso: Double) {
        this.peso = peso
    }

    fun mostrarPeso(): Double {
        return peso
    }

    fun cadastrarAltura(altura: Double) {
        this.altura = altura
    }

    fun mostrarAltura(): Double {
        return altura
    }

    fun calcularIMC(): Double {
        return peso / (altura * altura)
    }
}

fun situacaoIMC(imc: Double): String {
    return when {
        imc < 18.5 -> "Abaixo do peso ideal"
        imc < 25.0 -> "Peso normal"
        imc < 30.0 -> "Acima do peso"
        imc < 35.0 -> "Obesidade grau I"
        imc < 40.0 -> "Obesidade grau II"
        else -> "Obesidade grau III"
    }
}

fun main() {
    // Instanciando dois objetos do tipo Pessoas
    val pessoa1 = Pessoas()
    val pessoa2 = Pessoas()

    // Atribuindo valores para pessoa1
    pessoa1.cadastrarNome("Ana")
    pessoa1.cadastrarIdade(25)
    pessoa1.cadastrarPeso(60.0)
    pessoa1.cadastrarAltura(1.65)

    // Atribuindo valores para pessoa2
    pessoa2.cadastrarNome("Bruno")
    pessoa2.cadastrarIdade(30)
    pessoa2.cadastrarPeso(85.0)
    pessoa2.cadastrarAltura(1.75)

    // Exibindo os dados da pessoa1
    println("Dados da Pessoa 1:")
    println("Nome: ${pessoa1.mostrarNome()}")
    println("Idade: ${pessoa1.mostrarIdade()}")
    println("Peso: ${pessoa1.mostrarPeso()} kg")
    println("Altura: ${pessoa1.mostrarAltura()} m")
    val imc1 = pessoa1.calcularIMC()
    println("IMC: %.2f".format(imc1))
    println("Situação: ${situacaoIMC(imc1)}")
    println()

    // Exibindo os dados da pessoa2
    println("Dados da Pessoa 2:")
    println("Nome: ${pessoa2.mostrarNome()}")
    println("Idade: ${pessoa2.mostrarIdade()}")
    println("Peso: ${pessoa2.mostrarPeso()} kg")
    println("Altura: ${pessoa2.mostrarAltura()} m")
    val imc2 = pessoa2.calcularIMC()
    println("IMC: %.2f".format(imc2))
    println("Situação: ${situacaoIMC(imc2)}")
}
