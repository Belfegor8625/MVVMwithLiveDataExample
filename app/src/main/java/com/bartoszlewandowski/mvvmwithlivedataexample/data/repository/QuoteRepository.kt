package com.bartoszlewandowski.mvvmwithlivedataexample.data.repository

import androidx.lifecycle.LiveData
import com.bartoszlewandowski.mvvmwithlivedataexample.data.model.Quote

/**
 * Created by Bartosz Lewandowski on 16.08.2020
 */
interface QuoteRepository {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}