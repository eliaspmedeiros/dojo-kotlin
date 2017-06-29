package br.com.cwi.dojokotlin.helper

import java.util.*

interface HashGenerator {

    fun generate() = UUID.randomUUID()

}