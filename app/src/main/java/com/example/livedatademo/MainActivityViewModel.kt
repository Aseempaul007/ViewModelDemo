package com.example.livedatademo

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    var num =0

    fun addOne(){
        num++
    }
}