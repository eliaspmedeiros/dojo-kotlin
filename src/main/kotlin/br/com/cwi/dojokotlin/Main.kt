package br.com.cwi.dojokotlin

import br.com.cwi.dojokotlin.helper.create
import br.com.cwi.dojokotlin.model.Author
import br.com.cwi.dojokotlin.model.Book
import br.com.cwi.dojokotlin.model.PocketBook
import java.util.*

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val author = Author("Stephen King", birth = Date().create("dd-MM-yyyy", "21-09-1947"))
        val book = Book("O Iluminado", 49.9, author)

        val pocketbook = PocketBook("Quatro Estações", 29.9, author)

        println(book.getDescription())
        println(pocketbook.getDescription())
        println(pocketbook.getAuthorName())



        println("Encontrado: " + Book.lookup("O Mundo de sofia")?.name)
    }

}