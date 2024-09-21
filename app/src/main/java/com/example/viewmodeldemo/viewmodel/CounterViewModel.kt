package com.example.viewmodeldemo.viewmodel

import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var counter: Int = 0
    fun increment() {
        counter++
    }
    fun decrement() {
        counter--
    }
    fun reset() {
        counter = 0
    }
}