package br.com.cwi.dojokotlin.model

import br.com.cwi.dojokotlin.ListItem
import br.com.cwi.dojokotlin.helper.DEFAULT_FORMAT
import br.com.cwi.dojokotlin.helper.set
import br.com.cwi.dojokotlin.helper.getYearsBetweenDates
import java.util.Date

class Author(name: String, var gender: String = "M", val birth: Date) : BaseModel(), ListItem {
    override var name: String = name
        get() = field
        set(value) {
           field = value.capitalize()
        }

    companion object {
        private fun parseDate(value: String?): Date? {
            return if (value != null) Date().set(DEFAULT_FORMAT, value) else null
        }
    }

    var death: Date? = null

    // Nem tudo são flores no Kotlin.
    constructor(name: String, gender: String = "M", birth: Date, death: Date?) : this(name, gender, birth) {
        this.death = if (death == null || death > birth) death else deathDateError()
    }

    /**
     * Permite construção com datas como String, desde que utilizado o formato definido na constante DEFAULT_FORMAT
     */
    constructor(name: String, gender: String = "M", birth: String, death: String? = null) : this(name, gender, parseDate(birth)!!, parseDate(death))

    /**
     * Retorna a idade que o autor teria em qualquer data posterior ao seu nascimento.
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