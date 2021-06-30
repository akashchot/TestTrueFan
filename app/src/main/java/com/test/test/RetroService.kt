package com.test.test

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroService {

    private val BASE_URL = "https://www.mocky.io/v2/"

    fun getRetroInstance(): Retrofit {

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService: ApiService = getRetroInstance().create(ApiService::class.java)
}