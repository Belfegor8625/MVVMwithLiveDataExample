package com.bartoszlewandowski.mvvmwithlivedataexample.ui.quotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bartoszlewandowski.mvvmwithlivedataexample.QuotesApplication
import com.bartoszlewandowski.mvvmwithlivedataexample.R
import com.bartoszlewandowski.mvvmwithlivedataexample.data.model.Quote
import kotlinx.android.synthetic.main.activity_quotes.*
import org.kodein.di.DIAware
import org.kodein.di.instance


class QuotesActivity() : AppCompatActivity(), DIAware {

    override val di by lazy { (applicationContext as QuotesApplication).di }
    private val viewModelFactory: QuotesViewModelFactory by instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)
        initializeUi()
    }

    private fun initializeUi() {
        val viewModel = ViewModelProvider(this, viewModelFactory)
            .get(QuotesViewModel::class.java)

        viewModel.getQuotes().observe(this, Observer { quotes ->
            val stringBuilder = StringBuilder()
            quotes.forEach { quote ->
                stringBuilder.append("$quote\n\n")
            }
            textView_quotes.text = stringBuilder.toString()
        })
        button_add_quote.setOnClickListener {
            val quote = Quote(
                editText_quote.text.toString(),
                editText_author.text.toString()
            )
            viewModel.addQuote(quote)
            editText_quote.setText("")
            editText_author.setText("")
        }
    }


}