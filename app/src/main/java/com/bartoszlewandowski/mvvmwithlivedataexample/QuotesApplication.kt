package com.bartoszlewandowski.mvvmwithlivedataexample

import android.app.Application
import com.bartoszlewandowski.mvvmwithlivedataexample.data.db.Database
import com.bartoszlewandowski.mvvmwithlivedataexample.data.db.DatabaseFakeImpl
import com.bartoszlewandowski.mvvmwithlivedataexample.data.db.QuoteDao
import com.bartoszlewandowski.mvvmwithlivedataexample.data.repository.QuoteRepository
import com.bartoszlewandowski.mvvmwithlivedataexample.data.repository.QuoteRepositoryImpl
import com.bartoszlewandowski.mvvmwithlivedataexample.ui.quotes.QuotesViewModelFactory
import org.kodein.di.*


/**
 * Created by Bartosz Lewandowski on 16.08.2020
 */
class QuotesApplication : Application(), DIAware {
    override val di = DI.lazy {
        bind<Database>() with singleton { DatabaseFakeImpl() }
        bind<QuoteDao>() with singleton { instance<Database>().quoteDao }
        bind<QuoteRepository>() with singleton { QuoteRepositoryImpl(instance()) }
        bind() from provider { QuotesViewModelFactory(instance()) }
    }
}