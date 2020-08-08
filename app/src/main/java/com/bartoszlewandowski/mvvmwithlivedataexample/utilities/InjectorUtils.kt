package com.bartoszlewandowski.mvvmwithlivedataexample.utilities

import com.bartoszlewandowski.mvvmwithlivedataexample.QuoteRepository
import com.bartoszlewandowski.mvvmwithlivedataexample.data.FakeDatabase
import com.bartoszlewandowski.mvvmwithlivedataexample.ui.quotes.QuotesViewModelFactory

/**
 * Created by Bartosz Lewandowski on 08.08.2020
 */
object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}