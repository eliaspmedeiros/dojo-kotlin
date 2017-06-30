package br.com.cwi.dojokotlin

import br.com.cwi.dojokotlin.helper.DataSource
import br.com.cwi.dojokotlin.helper.failure
import br.com.cwi.dojokotlin.model.Book
import br.com.cwi.dojokotlin.store.BookStore

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        // pega um dos livros já criados
        val book = DataSource.books.first()
        // coloca um no estoque
        val bookStock: HashMap<Book, Int> = hashMapOf(book to 1)
        // cria a loja
        val bookStore = BookStore(bookStock)

        fun success() = println("Sucesso")
        bookStore.sellItem(book, { println("Sucesso") }, { println("falha") })
        bookStore.sellItem(book, ::success, ::failure)
    }


}