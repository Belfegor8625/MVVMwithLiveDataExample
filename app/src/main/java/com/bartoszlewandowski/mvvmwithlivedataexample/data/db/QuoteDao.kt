package com.bartoszlewandowski.mvvmwithlivedataexample.data.db

import androidx.lifecycle.LiveData
import com.bartoszlewandowski.mvvmwithlivedataexample.data.model.Quote

/**
 * Created by Bartosz Lewandowski on 16.08.2020
 */
interface QuoteDao {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}