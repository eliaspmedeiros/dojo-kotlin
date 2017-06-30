package br.com.cwi.dojokotlin.model

import br.com.cwi.dojokotlin.SellableItem
import br.com.cwi.dojokotlin.ListItem
import br.com.cwi.dojokotlin.helper.DataSource

open class Book(
    override var name: String,
    override var price: Double,
    val author: Author
) : BaseModel(), ListItem, SellableItem {

    // Funções de um companion object podem ser chamadas como se fosse estáticas.
    // Mas para o serem realmente, é necessária a anotação @JvmStatic
    companion object {
        fun lookup(search: String): Book? {
            // O find retorna o primeiro item que satisfizer a condição do lambda
            return DataSource.books.find { it.name.toLowerCase() == search.toLowerCase() }
        }
    }

    override fun getDescription(): String {
        // Delega a função para uma das interfaces
        return super<SellableItem>.getDescription()
    }

    // Necessário adicionar o open para permitir override
    fun getAuthorName() = author.name

}