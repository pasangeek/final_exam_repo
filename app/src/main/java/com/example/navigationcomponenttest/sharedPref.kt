package com.example.navigationcomponenttest

import android.content.Context
import android.content.SharedPreferences

class sharedPref(context: Context) {


    private val KEY_USER = "user"

    private val sharedPref = context.getSharedPreferences("MySharedpref",Context.MODE_PRIVATE)
    private val editor: SharedPreferences.Editor = sharedPref.edit()



    fun getUsername() : String? = sharedPref.getString(KEY_USER, "admin")
    fun saveUsername(username: String) {
        editor.putString(KEY_USER, username).commit()
    }

    fun getPassword():String?=sharedPref.getString(KEY_USER,"password")
    fun savePassword(password:String){
        editor.putString(KEY_USER, password).commit()
    }

    interface UserPreferenceListener {
        fun onSuccess(userCount: Int)

        fun onError()
    }

}