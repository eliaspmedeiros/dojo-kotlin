package br.com.cwi.dojokotlin.helper

public fun printSomething() {
    val a = "String"
    var b: String? = null
    val c: String = "Obviamente uma string"
    var d: String = "Obviamente outra string"

    b = a

    val list = arrayListOf(a, b, c, d)

    list.forEach { println(it) }
}

private val authors = arrayListOf("Stephen King", "Mario Puzo", "J. R. R. Tolkien")

fun authorCount() = authors.size

fun buildLogSentence(subject: String = "livro", action: String = "adicionado", count: Int = 1) {
    println("Total de $count $subject $action")
}

fun suggestMe(type: String = ""): String {
    return when(type) {
        "AUTHOR" -> "Paulo Coelho"
        "BOOK", "BOX" -> "Lord of the Rings"
        else -> "Sugiro você ser mais específico"
    }
}

fun doesAuthorSuck(name: String?): Boolean = if (name == "Paulo Coelho") true else false
