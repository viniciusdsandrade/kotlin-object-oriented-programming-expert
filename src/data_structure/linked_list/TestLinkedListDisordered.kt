package data_structure.linked_list

fun main() {
    // Criando uma lista encadeada circular ordenada de Inteiros
    val lista = LinkedListDisordered<Int>()

    // Adicionando elementos
    lista.addLast(1)
    lista.addFirst(2)
    lista.addFirst(3)
    lista.addFirst(4)
    lista.addFirst(5)
    lista.addFirst(0)
    lista.addAt(6, 6)
    println("Lista:             $lista")
    lista.sort()
    println("Lista ordenada:    $lista")
    lista.shuffle()
    println("Lista embaralhada: $lista")

    val copia = LinkedListDisordered(lista)
    println("Cópia:             $copia")
    val copia2 = lista.clone()
    println("Clone:             $copia2")

    lista.addFirst(10)
    println("Lista após adicionar 10 no início: $lista")
    println("Cópia:                             $copia")
    println("Clone:                             $copia2")

    // Imprimindo o tamanho da lista
    println("Tamanho da lista: ${lista.getSize()}")

    for (i in 0..<lista.getSize())
        println("Elemento na posição $i: ${lista.get(i)}")

    println("Lista.getFirst(): ${lista.getFirst()}")
    println("Lista.getLast():  ${lista.getLast()}")

    // Removendo elementos
    lista.removeFirst()
    println("Lista após remover o primeiro elemento: $lista")

    lista.removeLast()
    println("Lista após remover o último elemento: $lista")

    lista.removeAt(3)
    println("Lista após remover o elemento na posição 3: $lista")

    lista.indexOf(3)
    println("lista.indexOf(3): ${lista.indexOf(3)}")

    lista.indexOf(10)
    println("lista.indexOf(10): ${lista.indexOf(10)}")

    println("lista.isEmpty(): ${lista.isEmpty()}")
    lista.clear()
    println("Lista após limpar: $lista")
    println("lista.isEmpty(): ${lista.isEmpty()}")

    val lista2 = LinkedListDisordered<Int>()
    lista2.addLast(1)
    lista2.addLast(2)
    lista2.addLast(3)
    lista2.addLast(4)
    lista2.addLast(5)
    lista2.addLast(6)

    val lista3 = LinkedListDisordered<Int>()
    lista3.addFirst(1)
    lista3.addFirst(2)
    lista3.addFirst(3)
    lista3.addFirst(4)
    lista3.addFirst(5)
    lista3.addFirst(6)

    println("Lista2:               $lista2")
    println("Lista3:               $lista3")

    lista2.sort()
    lista3.sort()

    lista2.reverse()
    lista3.reverse()

    println("Lista2 e Lista3 após ordenação:")
    println("Lista2:               $lista2")
    println("Lista3:               $lista3")

    println("Lista2.hashCode(): ${lista2.hashCode()}")
    println("Lista3.hashCode(): ${lista3.hashCode()}")

    println("Lista2.equals(Lista3): ${lista2.equals(lista3)}")
}
