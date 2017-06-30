package br.com.cwi.dojokotlin.store

abstract class BaseStore<T>(open var items: HashMap<T, Int>) {

    fun sellItem(itemToSell: T, success: () -> Unit, failure: () -> Unit) {
        val stockItem = items[itemToSell]

        if (stockItem != null && stockItem > 0) {
            items[itemToSell] = items[itemToSell]!! - 1
            success()
        } else {
            failure()
        }
    }

}