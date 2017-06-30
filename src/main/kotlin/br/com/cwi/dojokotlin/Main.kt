package br.com.cwi.dojokotlin

import br.com.cwi.dojokotlin.helper.DataSource
import br.com.cwi.dojokotlin.model.Book

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        println("Encontrado: " + (Book.lookup("O Mundo de Jacó")?.name ?: "nenhum livro"))

        println(Book.getRomanceBooksNames())

        DataSource.authors.forEach {
            println(it.getAgeIn())
        }
    }

}