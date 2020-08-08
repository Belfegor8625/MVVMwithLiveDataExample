package com.bartoszlewandowski.mvvmwithlivedataexample

import com.bartoszlewandowski.mvvmwithlivedataexample.data.FakeQuoteDao
import com.bartoszlewandowski.mvvmwithlivedataexample.data.Quote

/**
 * Created by Bartosz Lewandowski on 06.08.2020
 */
class QuoteRepository private constructor(private val quoteDao: FakeQuoteDao) {

    fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    fun getQuotes() = quoteDao.getQuotes()

    companion object {
        @Volatile
        private var instance: QuoteRepository? = null

        fun getInstance(quoteDao: FakeQuoteDao) = instance ?: synchronized(this) {
            instance ?: QuoteRepository(quoteDao).also { instance = it }
        }
    }
}