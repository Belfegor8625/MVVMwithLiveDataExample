package com.bartoszlewandowski.mvvmwithlivedataexample.ui.quotes

import androidx.lifecycle.ViewModel
import com.bartoszlewandowski.mvvmwithlivedataexample.QuoteRepository
import com.bartoszlewandowski.mvvmwithlivedataexample.data.Quote

/**
 * Created by Bartosz Lewandowski on 06.08.2020
 */
class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {
    fun getQuotes() = quoteRepository.getQuotes()
    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}