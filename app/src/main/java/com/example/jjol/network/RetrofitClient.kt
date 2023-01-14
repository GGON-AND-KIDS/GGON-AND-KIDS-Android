package com.example.jjol.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    private val baseURI = ""

    val retrofit = Retrofit.Builder()
        .baseUrl(baseURI)
        .client(okHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

private fun okHttpClient(): OkHttpClient {
    val httpLoggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    val authorizationInterceptor = AuthorizationInterceptor()

    return OkHttpClient.Builder()
        .addInterceptor(httpLoggingInterceptor)
        .addInterceptor(authorizationInterceptor)
        .build()
}