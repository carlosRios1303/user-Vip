package com.example.uservip.model

import android.content.Context

class Prefs(val context:Context) {
    val SHARED_NAME = "Mydtb"
    val SHARED_USER_NAME = "username"
    val SHARED_VIP = "vip"

    val storage = context.getSharedPreferences(SHARED_NAME,  0)

    //recibe un nombre para ser guardado en la base de datos (storage)
    fun saveName(name:String){
        storage.edit().putString(SHARED_USER_NAME, name).apply()

    }
    // guardammos en la bd si el usuario ha seleccionado el checkbox
    fun saveVIP(vip:Boolean){
        storage.edit().putBoolean(SHARED_VIP,vip).apply()
    }

    // nos recupera el nombre ingresado ( en caso de null llena vacio )
    fun getName():String{
        return storage.getString(SHARED_USER_NAME, "")!!
    }

    // Retorna si el usuario ha seleccionado checkbox
    fun getVIP():Boolean{
        return storage.getBoolean(SHARED_VIP, false)
    }

    fun wipe(){
        storage.edit().clear().apply()
    }

}