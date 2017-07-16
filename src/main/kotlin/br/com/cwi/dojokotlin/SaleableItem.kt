package br.com.cwi.dojokotlin

/**
 * Item que pode ser vendido.
 */
interface SaleableItem {

    var name: String
    var price: Double

    fun getDescription(): String {
        return "$name - R$${price}"
    }

}