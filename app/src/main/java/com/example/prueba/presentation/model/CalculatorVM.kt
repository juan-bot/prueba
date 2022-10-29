package com.example.prueba.presentation.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorVM: ViewModel() {
    var resultado: MutableLiveData<String> = MutableLiveData()
    fun calculaRes(num1: String, op: Char, num2: String ){
        var res=0
        when(op){
            '+' -> res = num1.toInt() + num2.toInt()
            '/' -> res = num1.toInt() / num2.toInt()
            'x' -> res = num1.toInt() * num2.toInt()
        }

        resultado.postValue(res.toString())
    }
}