package poo

import java.time.LocalDate
import java.time.Period
import java.util.Objects

class Aluno {
    private var nome: String
    private var dataNascimento: LocalDate
    private var matricula: String

    constructor() {
        this.nome = ""
        this.dataNascimento = LocalDate.now()
        this.matricula = ""
    }

    constructor(
        nome: String,
        dataNascimento: LocalDate,
        matricula: String
    ) {
        this.nome = nome
        this.dataNascimento = dataNascimento
        this.matricula = matricula
    }

    fun getNome(): String {
        return nome
    }
    fun getDataNascimento(): LocalDate {
        return dataNascimento
    }
    fun getMatricula(): String {
        return matricula
    }
    fun setNome(nome: String) {
        this.nome = nome
    }
    fun setDataNascimento(dataNascimento: LocalDate) {
        this.dataNascimento = dataNascimento
    }
    fun setMatricula(matricula: String) {
        this.matricula = matricula
    }
    fun calculateAge(): Int {
        return Period.between(dataNascimento, LocalDate.now()).years
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (this.javaClass != other.javaClass) return false

        other as Aluno

        return Objects.equals(this.nome, other.nome) &&
                Objects.equals(this.dataNascimento, other.dataNascimento) &&
                Objects.equals(this.matricula, other.matricula)
    }

    override fun hashCode(): Int {
        val prime = 31
        var hash = 1

        hash *= prime + nome.hashCode()
        hash *= prime + dataNascimento.hashCode()
        hash *= prime + matricula.hashCode()

        if (hash < 0) hash *= -1

        return hash
    }

    override fun toString(): String {
        return "Aluno(nome='$nome', dataNascimento=$dataNascimento, matricula='$matricula')"
    }
}

fun main() {
    val aluno1 = Aluno("João", LocalDate.of(2000, 1, 1), "123")
    val aluno2 = Aluno("João", LocalDate.of(2000, 1, 1), "123")

    println(aluno1 == aluno2)
    println(aluno1.hashCode())
    println(aluno2.hashCode())
    println(aluno1)
    println(aluno2)
}
