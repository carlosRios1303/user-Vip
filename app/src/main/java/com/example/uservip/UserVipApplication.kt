package com.example.uservip


import android.app.Application
import com.example.uservip.model.Prefs

class UserVipApplication: Application() {

    companion object{
        lateinit var prefs: Prefs
    }
    override fun onCreate() {
        super.onCreate()
         prefs = Prefs(applicationContext)
    }
}