package br.com.cwi.dojokotlin.helper

import br.com.cwi.dojokotlin.model.Author
import br.com.cwi.dojokotlin.model.Book
import java.text.SimpleDateFormat
import java.util.*

object DataSource {

    val authors = arrayListOf(
        Author("Stephen King", birth = Date().create("dd-MM-yyyy", "21-09-1947")),
        Author("jostein gaarder", birth = Date().create("dd-MM-yyyy", "08-08-1952")),
        Author("Douglas Adams", birth = Date().create("dd-MM-yyyy", "11-03-1952"), death = Date().create("dd-MM-yyyy", "11-05-2001"))
    )

    val books = arrayListOf(
        Book("O Mundo de Sofia", 50.0, authors[1]),
        Book("O Dia do Curinga", 42.0, authors[1]),
        Book("O Restaurante no Fim do Universo", 19.9, authors[2])
    )

}