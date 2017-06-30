package br.com.cwi.dojokotlin.store

import br.com.cwi.dojokotlin.helper.getLoggedUser

abstract class BaseStore<T>(open var items: HashMap<T, Int>) {

    val user: String? by lazy {
        println("Accessing current user")
        getLoggedUser()
    }

    fun sellItem(itemToSell: T, success: () -> Unit, failure: () -> Unit) {
        val stockItem = items[itemToSell]

        if (user != null) {
            println("Realizando compra com usuário: $user")
        } else {
            failure()
        }

        if (stockItem != null && stockItem > 0) {
            items[itemToSell] = items[itemToSell]!! - 1
            success()
        } else {
            failure()
        }
    }

}
