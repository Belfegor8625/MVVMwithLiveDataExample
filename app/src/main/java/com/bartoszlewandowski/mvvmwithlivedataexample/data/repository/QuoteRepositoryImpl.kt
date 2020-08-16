package com.bartoszlewandowski.mvvmwithlivedataexample.data.repository

import com.bartoszlewandowski.mvvmwithlivedataexample.data.db.QuoteDao
import com.bartoszlewandowski.mvvmwithlivedataexample.data.db.QuoteDaoFakeImpl
import com.bartoszlewandowski.mvvmwithlivedataexample.data.model.Quote

/**
 * Created by Bartosz Lewandowski on 06.08.2020
 */
class QuoteRepositoryImpl(private val quoteDao: QuoteDao) : QuoteRepository {

    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuotes() = quoteDao.getQuotes()
}