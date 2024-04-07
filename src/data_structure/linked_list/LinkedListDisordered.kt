package data_structure.linked_list

import data_structure.ShallowOrDeepCopy.verifyAndCopy
import java.util.*

@Suppress("UNCHECKED_CAST")
class LinkedListDisordered<X> : Cloneable {
    inner class Node : Cloneable {
        var elemento: X? = null
        var proximo: Node? = null

        constructor(elemento: X) {
            this.elemento = elemento
            this.proximo = null
        }

        constructor(modelo: Node?) {
            requireNotNull(modelo) { "Nó não pode ser nulo" }

            this.elemento = modelo.elemento as X
            this.proximo = modelo.proximo as Node
        }

        public override fun clone(): Any {
            var clone: Node? = null
            try {
                clone = Node(this)
            } catch (ignored: Exception) {
            }
            return clone as Any
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null) return false
            if (this.javaClass != other.javaClass) return false

            val that = other as LinkedListDisordered<*>.Node

            return Objects.equals(this.elemento, that.elemento)
        }

        override fun hashCode(): Int {
            val prime = 31
            var hash = 1

            hash *= prime + (if ((this.elemento == null)) 0 else elemento.hashCode())

            if (hash < 0) hash = -hash

            return hash
        }

        override fun toString(): String {
            return if (proximo != null) elemento.toString() + " -> " + proximo!!.elemento
            else elemento.toString()
        }
    }

    private var primeiro: Node? = null
    private var tamanho: Int = 0

    constructor() {
        primeiro = null
        tamanho = 0
    }

    fun getSize(): Int {
        return tamanho
    }

    fun getPrimeiro(): Node? {
        return primeiro
    }

    fun addFirst(elemento: X?) {
        requireNotNull(elemento) { "Valor não pode ser nulo" }

        // Cria um nó com o elemento fornecido
        val no = Node(verifyAndCopy(elemento) as X)

        no.proximo = primeiro // Define o próximo nó do no nó como o atual primeiro nó da lista
        primeiro = no // Atualiza o primeiro nó da lista para ser o no nó

        tamanho++
    }

    fun addLast(elemento: Any) {

        val no = Node(verifyAndCopy(elemento) as X)

        // Se a lista estiver vazia, define o no nó como o primeiro nó da lista
        if (primeiro == null) {
            primeiro = no
            tamanho++
            return
        }

        var aux: Node =
            primeiro as Node // Se a lista não estiver vazia, encontra o último nó e adiciona o no nó após ele

        while (aux.proximo != null) aux = aux.proximo!!

        aux.proximo = no

        tamanho++
    }

    fun addAt(elemento: X?, indice: Int) {
        requireNotNull(elemento) { "Valor não pode ser nulo" }
        if (indice < 0 || indice > tamanho) throw IndexOutOfBoundsException("Index out of bounds")

        // Se o índice for 0, insere o elemento no início da lista
        if (indice == 0) {
            addFirst(elemento)
            return
        }

        // Se o índice for igual ao tamanho da lista, insere o elemento no final da lista
        if (indice == tamanho) {
            addLast(elemento)
            return
        }

        // Cria um novo nó com o elemento fornecido
        val novo = Node(verifyAndCopy(elemento) as X)
        // Encontra o nó na posição anterior à posição desejada
        var aux = primeiro!!
        for (i in 0..<indice - 1) aux = aux.proximo!!

        // Insere o novo nó após o nó encontrado
        novo.proximo = aux.proximo
        aux.proximo = novo

        tamanho++
    }

    fun get(indice: Int): X {
        if (indice < 0 || indice >= tamanho) throw IndexOutOfBoundsException("Index out of bounds")

        var aux = primeiro
        for (i in 0..<indice) aux = aux!!.proximo

        return aux!!.elemento as X
    }

    fun getFirst(): X {
        if (primeiro == null) throw NoSuchElementException("Lista vazia")
        return primeiro!!.elemento as X
    }

    fun getLast(): X {
        if (primeiro == null) throw NoSuchElementException("Lista vazia")

        var aux = primeiro
        while (aux!!.proximo != null) aux = aux.proximo

        return aux.elemento as X
    }

    fun removeFirst() {
        if (primeiro == null) throw NoSuchElementException("Lista vazia")

        primeiro = primeiro!!.proximo
        tamanho--
    }

    fun removeLast() {
        if (primeiro == null) throw NoSuchElementException("Lista vazia")

        if (primeiro!!.proximo == null) {
            primeiro = null
            tamanho--
            return
        }

        var aux = primeiro
        while (aux!!.proximo!!.proximo != null) aux = aux.proximo

        aux.proximo = null
        tamanho--
    }

    fun removeAt(indice: Int) {
        if (indice < 0 || indice >= tamanho) throw IndexOutOfBoundsException("Index out of bounds")

        if (indice == 0) {
            removeFirst()
            return
        }

        if (indice == tamanho - 1) {
            removeLast()
            return
        }

        var aux = primeiro
        for (i in 0..<indice - 1) aux = aux!!.proximo

        aux!!.proximo = aux.proximo!!.proximo
        tamanho--
    }

    fun indexOf(elemento: X): Int {
        var aux = primeiro
        for (i in 0..<tamanho) {
            if (aux!!.elemento == elemento) return i
            aux = aux.proximo
        }
        return -1
    }

    fun contains(elemento: X): Boolean {
        return indexOf(elemento) != -1
    }

    fun clear() {
        primeiro = null
        tamanho = 0
    }

    fun isEmpty(): Boolean {
        return tamanho == 0
    }

    fun reverse() {
        var prev: Node? = null
        var current = primeiro
        var next: Node?

        while (current != null) {
            next = current.proximo
            current.proximo = prev
            prev = current
            current = next
        }

        primeiro = prev
    }

    fun sort() {
        if (tamanho <= 1) return

        var i = 0
        var j: Node?
        var trocado: Boolean
        var temp: X

        do {
            trocado = false
            j = primeiro
            while (j!!.proximo != null) {
                if (j.proximo!!.elemento?.let { (j!!.elemento as Comparable<X>).compareTo(it) }!! > 0) {
                    temp = j.elemento as X
                    j.elemento = j.proximo!!.elemento
                    j.proximo!!.elemento = temp
                    trocado = true
                }
                j = j.proximo
            }
            i++
        } while (trocado)
    }

    fun shuffle() {
        val random = Random()
        for (i in 0..<tamanho) {
            val randomIndex = random.nextInt(tamanho)
            var aux = primeiro
            for (j in 0..<randomIndex) aux = aux!!.proximo
            val temp = primeiro!!.elemento
            primeiro!!.elemento = aux!!.elemento
            aux.elemento = temp
        }
    }

    constructor(modelo: LinkedListDisordered<X>?) {
        requireNotNull(modelo) { "Lista não pode ser nula" }

        if (modelo.primeiro == null) {
            this.primeiro = null
            this.tamanho = 0
            return
        }

        this.primeiro = modelo.primeiro!!.elemento?.let { Node(it) }
        var aux = modelo.primeiro

        while (aux?.proximo != null) {
            aux = aux.proximo
            addLast(verifyAndCopy(aux!!.elemento as Any))
        }

        this.tamanho = modelo.tamanho
    }

    public override fun clone(): Any {
        var clone = LinkedListDisordered<X>()
        try {
            clone = LinkedListDisordered(this)
        } catch (ignored: Exception) {
        }
        return clone
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (this.javaClass != other.javaClass) return false

        val that = other as LinkedListDisordered<*>

        if (tamanho != that.tamanho) return false

        var thisNode = this.primeiro
        var thatNode = that.primeiro

        while (thisNode != null && thatNode != null) {
            if (!Objects.equals(thisNode.elemento, thatNode.elemento))
                return false
            thisNode = thisNode.proximo
            thatNode = thatNode.proximo
        }

        return thisNode == null && thatNode == null
    }

    override fun hashCode(): Int {
        val prime = 31
        var hash = 1

        var index = 0
        var aux = primeiro

        while (aux != null) {
            // Combina o hashCode do elemento com a posição na lista
            hash = prime * hash + Objects.hash(aux.elemento, index)
            aux = aux.proximo
            index++
        }

        return hash
    }

    override fun toString(): String {
        val result = StringBuilder("[")
        var aux = primeiro
        while (aux != null) {
            result.append(aux.elemento)
            if (aux.proximo != null) result.append(" -> ")
            aux = aux.proximo
        }
        result.append("]")
        return result.toString()
    }
}