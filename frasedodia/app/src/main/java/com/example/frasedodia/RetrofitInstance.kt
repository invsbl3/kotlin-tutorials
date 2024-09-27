package com.example.frasedodia

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val base_Url = "https://zenquotes.io/api/"

    private fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(base_Url)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    val quoteApi : QuoteApi = getInstance().create(QuoteApi::class.java)

}