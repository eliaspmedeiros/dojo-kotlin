package br.com.cwi.dojokotlin.model

import br.com.cwi.dojokotlin.helper.getYearsBetweenDates
import java.util.Date

class Author(var name: String, var gender: String? = "M", val birth: Date) {
    init {
        name = name.toUpperCase()
    }

    var death: Date? = null

    constructor(name: String, gender: String? = "M", birth: Date, death: Date) : this(name, gender, birth) {
        if (death < birth) {
            throw IllegalArgumentException("Data de morte é menor que nascimento")
        }

        this.death = death
    }

    /**
     * Retorna a idade que o autor teria em qualquer data.
     */
    fun getAgeIn(date: Date = Date()): String {
        val text = when {
            date < birth -> "Data anterior ao nascimento"
            date == birth -> "Data igual ao nascimento"
            else -> "Idade do autor $name é de ${getYearsBetweenDates(birth, date)} anos."
        }

        return text
    }

}