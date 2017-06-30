package br.com.cwi.dojokotlin.model

import br.com.cwi.dojokotlin.ListItem
import br.com.cwi.dojokotlin.helper.getYearsBetweenDates
import java.util.Date

class Author(override var name: String, var gender: String? = "M", val birth: Date) : BaseModel(), ListItem {
    init {
        name = name.toUpperCase()
    }

    var death: Date? = null

    constructor(name: String, gender: String? = "M", birth: Date, death: Date) : this(name, gender, birth) {
        this.death = if (death < birth) death else deathDateError()
    }

    /**
     * Retorna a idade que o autor teria em qualquer data.
     */
    fun getAgeIn(date: Date = Date()): String {
        return when {
            date < birth -> "Data anterior ao nascimento"
            date == birth -> "Data igual ao nascimento"
            else -> "Idade do autor $name é de ${getYearsBetweenDates(birth, date)} anos."
        }
    }

    // O tipo Nothing indica que a execução nunca passará do ponto onde esta função foi chamada
    fun deathDateError(): Nothing = throw IllegalArgumentException("Data de morte é menor que nascimento")

}