package com.example.philipplackner.flow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class StateFlowSharedFlowViewModel : ViewModel(){

    private val _stateFlow = MutableStateFlow(0)
    val stateFlow = _stateFlow.asStateFlow()

    private val _sharedFlow = MutableSharedFlow<Int>(replay = 5)
    val sharedFlow = _sharedFlow.asSharedFlow()


    init {
        viewModelScope.launch {
            sharedFlow.collect{
                delay(2000L)
                println("Shared Flow received no is $it")
            }
        }
        viewModelScope.launch {
            sharedFlow.collect{
                delay(3000L)
                println("Shared Flow received no is $it")
            }
        }
        squareNumberSharedFlow(5)
    }

    fun incrementCounterStateFlow(){
        //_stateFlow.value = stateFlow.value + 1
        _stateFlow.value += 1
    }


    fun squareNumberSharedFlow(number:Int){
        //_stateFlow.value = stateFlow.value + 1
        viewModelScope.launch {
            _sharedFlow.emit(number*number)
        }

    }
}