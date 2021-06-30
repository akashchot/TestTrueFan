package com.test.test

class ApiHelper(private val apiService: ApiService) {

    suspend fun getQuiz() = apiService.getQuiz()
}