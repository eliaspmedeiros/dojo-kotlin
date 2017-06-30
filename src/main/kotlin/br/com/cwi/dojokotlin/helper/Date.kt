package br.com.cwi.dojokotlin.helper

import java.text.SimpleDateFormat
import java.util.*

const val DEFAULT_FORMAT = "dd/MM/yyyy"

/**
 * Exemplo de tratamento contra null: safe ?. call
 */
fun getYearsBetweenDates(start: Date, end: Date? = null): Int {
    val safeEnd = end ?: Date()

    val diffMillis = safeEnd.time - start.time
    val years = Math.ceil(diffMillis / (86400.0 * 1000.0)).toInt() / 365

    return years
}

// Kotlin ainda nao suporta extensão de métodos "estáticos"
fun Date.create(format: String, value: String): Date = SimpleDateFormat(format).parse(value)
