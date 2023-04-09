package com.example.navigationcomponenttest

import androidx.databinding.Bindable

import androidx.lifecycle.ViewModel

class FragmentViewModel : ViewModel() {
    @get:Bindable
    var name: String = ""

    @get:Bindable
    var password: String = ""
}