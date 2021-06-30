package com.test.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var tvMessage : TextView

    lateinit var quizViewModel: QuizViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        quizViewModel = ViewModelProvider(this,ViewModelFactory(ApiHelper(RetroService.apiService))).get(QuizViewModel::class.java)

        tvMessage = findViewById(R.id.tv_message)

        quizViewModel.getQuiz().observe(this, Observer {
            try {
                tvMessage.text = it.msg
            }catch (e : Exception){
                e.printStackTrace()
            }
        })





    }
}