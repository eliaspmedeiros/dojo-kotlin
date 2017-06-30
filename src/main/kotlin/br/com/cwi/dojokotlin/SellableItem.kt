package br.com.cwi.dojokotlin

interface SellableItem {

    var name: String
    var price: Double

    fun getDescription(): String {
        return "$name - R$${price}"
    }

}