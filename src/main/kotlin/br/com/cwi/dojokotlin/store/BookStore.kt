package br.com.cwi.dojokotlin.store

import br.com.cwi.dojokotlin.model.Book

class BookStore(override var items: HashMap<Book, Int>) : BaseStore<Book>(items)