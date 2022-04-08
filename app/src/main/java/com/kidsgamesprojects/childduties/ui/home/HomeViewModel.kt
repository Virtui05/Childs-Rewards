package com.kidsgamesprojects.childduties.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment with dataBinding"
    }
    val text: LiveData<String> = _text


}