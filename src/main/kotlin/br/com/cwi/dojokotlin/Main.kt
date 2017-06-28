package br.com.cwi.dojokotlin

import br.com.cwi.dojokotlin.helper.authorCount
import br.com.cwi.dojokotlin.helper.buildSentence

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
//        printSomething()

        println("Total de autores: ${authorCount()}")

        buildSentence()
        buildSentence("Autor", "removido")
        buildSentence("Box", count = 1)
        buildSentence(count = 4, action = "perdido", subject = "livro")
    }


}