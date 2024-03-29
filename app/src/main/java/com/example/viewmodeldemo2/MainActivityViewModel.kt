package com.example.viewmodeldemo2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) : ViewModel() {
    private var total = MutableLiveData<Int>()
    var totalData:LiveData<Int>

    init {
        total.value = startingTotal
        totalData = total
    }

/*    fun getTotal():Int{
        return total
    }*/

    fun setTotal(input:Int){
        total.value =(total.value)?.plus(input)
    }
}