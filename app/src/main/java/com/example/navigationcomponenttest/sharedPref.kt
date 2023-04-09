package com.example.navigationcomponenttest

import android.content.Context
import android.content.SharedPreferences

class sharedPref(context: Context) {
    private val pref: SharedPreferences =
        context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE)
    private val editor: SharedPreferences.Editor = pref.edit()



    private fun savePref(key: String, value: String): Int {
        try {
            editor.putString(key, value)
            editor.commit()
        } catch (e: java.lang.Exception) {
            return 0;
        }

        return 1
    }

    private fun getPref(key: String): String? {
        return pref.getString(key, null)
    }

    interface UserPreferenceListener {
        fun onSuccess(userCount: Int)

        fun onError()
    }

}