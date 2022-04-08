package com.kidsgamesprojects.childduties.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class ChildAddOrEditViewModel : ViewModel() {
    private val _childName = MutableLiveData<String>().apply {
        value = "This is home Fragment with dataBinding"
    }
    val childName: MutableLiveData<String> = _childName

    private val _birthdayDate = MutableLiveData<Date>().apply {
        value = Calendar.getInstance().time
    }
    val birthDate: MutableLiveData<Date> = _birthdayDate

}