package com.bartoszlewandowski.mvvmwithlivedataexample.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bartoszlewandowski.mvvmwithlivedataexample.QuoteRepository

/**
 * Created by Bartosz Lewandowski on 07.08.2020
 */
class QuotesViewModelFactory(private val quoteRepository: QuoteRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepository) as T
    }
}