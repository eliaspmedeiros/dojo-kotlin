package br.com.cwi.dojokotlin

/**
 * Item que pode ser utilizado em uma listagem.
 */
interface ListItem {

    var name: String

    fun getDescription(): String {
        return name
    }

}