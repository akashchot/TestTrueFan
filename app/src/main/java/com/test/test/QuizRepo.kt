package com.test.test


class QuizRepo(private val apiHelper: ApiHelper) {

    suspend fun getQuiz() = apiHelper.getQuiz()


}