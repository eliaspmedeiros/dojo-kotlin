package br.com.cwi.dojokotlin

import br.com.cwi.dojokotlin.helper.authorCount
import br.com.cwi.dojokotlin.helper.buildLogSentence
import br.com.cwi.dojokotlin.helper.suggestMe

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
//        printSomething()

        println("Total de autores: ${authorCount()}")

        buildLogSentence()
        buildLogSentence("Autor", "removido")
        buildLogSentence("Box", count = 1)
        buildLogSentence(count = 4, action = "perdido", subject = "livro")

        println(suggestMe())
        println(suggestMe("AUTHOR"))
        println(suggestMe("BOOK"))
    }


}