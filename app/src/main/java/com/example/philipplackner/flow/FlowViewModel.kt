package com.example.philipplackner.flow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class FlowViewModel : ViewModel() {

    val countDownFlow = flow<Int> {
        val startingValue = 5
        var currentValue = startingValue
        emit(startingValue)
        while (currentValue > 0) {
            delay(1000L)
            currentValue--
            emit(currentValue)
        }
    }

    init {
        collectFlow()
    }

   /* private fun collectFlow() {
        viewModelScope.launch {
            val countVal = countDownFlow.filter { time ->
                time % 2 == 0
            }.map { time -> time * time }
                .onEach { time ->
                    println("time is $time")
                }.count{time->
                    time%2==0
                }
            println("time count val "+countVal)
            *//* countDownFlow.collectLatest{time->
                 delay(1500L)
                 println("counter time is $time")
             }*//*
        }
    }*/

    private fun collectFlow() {
        viewModelScope.launch {
            //output 15 becoz 5+4+3+2+1
           /* val reduceVal = countDownFlow.reduce{
                accumulator, value ->
                accumulator+value*/

            //it add initial+input value -> 115
             val foldVal = countDownFlow.fold(100){
                accumulator, value ->
                accumulator+value
            }

            println("time count val "+foldVal)
            /* countDownFlow.collectLatest{time->
                 delay(1500L)
                 println("counter time is $time")
             }*/
        }
    }
}