package br.com.cwi.dojokotlin

import br.com.cwi.dojokotlin.model.Author
import br.com.cwi.dojokotlin.model.Book
import br.com.cwi.dojokotlin.model.PocketBook
import java.text.SimpleDateFormat

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val author = Author("Stephen King", birth = SimpleDateFormat("dd-MM-yyyy").parse("21-09-1947"))
        val book = Book("O Iluminado", 49.9, author)

        val pocketbook = PocketBook("Quatro Estações", 29.9, author)

        println(book.getDescription())
        println(pocketbook.getDescription())
        println(pocketbook.getAuthorName())
    }

}