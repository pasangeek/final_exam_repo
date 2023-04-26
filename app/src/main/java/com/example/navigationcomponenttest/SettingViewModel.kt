package com.example.navigationcomponenttest

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingViewModel: ViewModel() {

    @get:Bindable
    var name: String = ""

    @get:Bindable
    var password: String = ""



    private val _user = MutableLiveData<String>("")
    val user: LiveData<String>
        get() = _user

    private val _pw = MutableLiveData<String>("")
    val psw: LiveData<String>
        get() = _pw

fun addUserAndPassword(){
    _user.value
    _pw.value

}

}