package com.test.test

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers

class QuizViewModel(private val quizRepo: QuizRepo) : ViewModel() {

    fun getQuiz() = liveData(Dispatchers.IO) {
        try {
            emit(quizRepo.getQuiz())
        }catch (e : Exception){
            e.printStackTrace()
        }

    }


}