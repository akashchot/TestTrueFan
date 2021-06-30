package com.test.test

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("5ec3eca9300000bed639c56e")
    fun getQuiz() : Quiz


}