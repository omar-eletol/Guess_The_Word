package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {


    private val _finalScore = MutableLiveData<Int>()
    val finalScore: LiveData<Int>
        get() = _finalScore

    private val _eventPlayAgain = MutableLiveData<Boolean>()
    val eventPlayAgain : LiveData<Boolean>
        get() = _eventPlayAgain


    init {

        _eventPlayAgain.value = false
        _finalScore.value = finalScore
        Log.i("ScoreViewModel", "final score is $finalScore")
    }

    //fun to change the state of the live data
    fun onPlayAgain() {
        _eventPlayAgain.value = true
    }

    //fun to change the state of the live data to false again
    fun onPlayAgainComplete() {
        _eventPlayAgain.value = false
    }
}