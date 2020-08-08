package com.bartoszlewandowski.mvvmwithlivedataexample.data

/**
 * Created by Bartosz Lewandowski on 06.08.2020
 */
class FakeDatabase private constructor() {

    var quoteDao = FakeQuoteDao()
        private set

    companion object {
        @Volatile
        private var instance: FakeDatabase? = null

        fun getInstance() = instance ?: synchronized(this) {
            instance ?: FakeDatabase().also { instance = it }
        }
    }
}