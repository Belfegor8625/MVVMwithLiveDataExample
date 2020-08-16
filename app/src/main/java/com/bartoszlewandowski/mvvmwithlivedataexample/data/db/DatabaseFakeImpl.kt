package com.bartoszlewandowski.mvvmwithlivedataexample.data.db

/**
 * Created by Bartosz Lewandowski on 06.08.2020
 */
class DatabaseFakeImpl : Database {

    override var quoteDao = QuoteDaoFakeImpl()
}