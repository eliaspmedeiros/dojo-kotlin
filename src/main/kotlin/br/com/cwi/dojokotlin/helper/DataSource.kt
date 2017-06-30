package br.com.cwi.dojokotlin.helper

import br.com.cwi.dojokotlin.model.Author
import br.com.cwi.dojokotlin.model.Book
import br.com.cwi.dojokotlin.model.BookType

object DataSource {

    val authors = arrayListOf(
        Author("Stephen King", birth = "21/09/1947"),
        Author("jostein gaarder", birth = "08/08/1952"),
        Author("Douglas Adams", birth = "11/03/1952", death = "11/05/2001"),
        Author("Franz Kafka", birth = "03/06/1883", death = "03/06/1924")
    )

    val books = arrayListOf(
        Book("O Mundo de Sofia", 50.0, authors[1]),
        Book("O Dia do Curinga", 42.0, authors[1]),
        Book("O Restaurante no Fim do Universo", 19.9, authors[2]),
        Book("A Metamorfose",16.9, authors[3], BookType.NOVEL)
    )

}