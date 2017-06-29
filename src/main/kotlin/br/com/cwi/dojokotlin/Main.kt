package br.com.cwi.dojokotlin

import br.com.cwi.dojokotlin.model.Author as BookAuthor
import java.text.SimpleDateFormat

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val author = BookAuthor(name = "jostein gaarder", birth = SimpleDateFormat("dd-MM-yyyy").parse("08-08-1952"))

        val deadAuthor = BookAuthor("arthur C. clarke", birth = SimpleDateFormat("dd-MM-yyyy").parse("16-12-1917"),
                death = SimpleDateFormat("dd-MM-yyyy").parse("19-03-2008"))

        println(author.getAgeIn())
        println(deadAuthor.getAgeIn())
    }

}