package com.example.uservip.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.uservip.R
import com.example.uservip.UserVipApplication.Companion.prefs
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        initUI()

    }
    private fun initUI(){
        btnCerrarSesion.setOnClickListener {
            prefs.wipe()
            onBackPressed()
        }
        val userName = prefs.getName()
        tvName.text = "Bienvenido$userName"
        if (prefs.getVIP()){
            setVIPColorBackground()
        }
    }
    private fun setVIPColorBackground(){
        container.setBackgroundColor(ContextCompat.getColor(this, R.color.amarillo))
    }
}