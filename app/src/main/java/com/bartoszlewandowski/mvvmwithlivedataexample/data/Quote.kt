package com.bartoszlewandowski.mvvmwithlivedataexample.data

/**
 * Created by Bartosz Lewandowski on 06.08.2020
 */
data class Quote(val quoteText: String,
                    val author: String) {
    override fun toString(): String {
        return "$quoteText - $author"
    }
}