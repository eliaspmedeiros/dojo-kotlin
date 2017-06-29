package br.com.cwi.dojokotlin.helper

import java.util.*

fun buildLogSentence(subject: String = "livro", action: String = "adicionado", count: Int = 1) {
    println("Total de $count $subject $action")
}

/**
 * Exemplo de tratamento contra null: safe ?. call
 */
fun getYearsBetweenDates(start: Date, end: Date? = null): Int {
    val diffMillis = end?.time?.minus(start.time)
    val deltaDays = Math.ceil(diffMillis?.div((86400.0 * 1000.0)) as Double).toInt() / 365

    return deltaDays
}

fun getYearsBetweenDatesToo(start: Date, end: Date? = null): Int {
    val safeEnd = end ?: Date()

    val diffMillis = safeEnd.time - start.time
    val deltaDays = Math.ceil(diffMillis / (86400.0 * 1000.0)).toInt() / 365

    return deltaDays
}