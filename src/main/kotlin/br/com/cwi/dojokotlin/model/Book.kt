package br.com.cwi.dojokotlin.model

import br.com.cwi.dojokotlin.SellableItem
import br.com.cwi.dojokotlin.ListItem

open class Book(
    override var name: String,
    override var price: Double,
    val author: Author
) : BaseModel(), ListItem, SellableItem {

    override fun getDescription(): String {
        return super<SellableItem>.getDescription()
    }

    fun getAuthorName() = author.name

}