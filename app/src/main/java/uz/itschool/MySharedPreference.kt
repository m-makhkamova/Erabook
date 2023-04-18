package uz.itschool

import android.content.Context
import android.content.SharedPreferences

class MySharedPreference {
    companion object{
        private var mySharedPreference = MySharedPreference()
        private var eraBook:SharedPreferences? = null
        private lateinit var editor:SharedPreferences.Editor
    }

    fun getInstance(context: Context):MySharedPreference{
        if(eraBook == null){
            eraBook = context.getSharedPreferences("eraBook", Context.MODE_PRIVATE)
        }
        return mySharedPreference
    }
    fun getStatus(): Boolean {
        return eraBook!!.getBoolean("status", false)
    }

    fun setStatus(status: Boolean) {
        editor = eraBook!!.edit()
        editor.putBoolean("status", status).apply()
    }
}