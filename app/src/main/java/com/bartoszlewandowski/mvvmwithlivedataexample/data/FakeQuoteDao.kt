package com.bartoszlewandowski.mvvmwithlivedataexample.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * Created by Bartosz Lewandowski on 06.08.2020
 */
class FakeQuoteDao {
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value = quoteList
    }

    fun addQuote(quote: Quote) {
        quoteList.add(quote)
        quotes.value = quoteList
    }

    fun getQuotes() = quotes as LiveData<List<Quote>>
}