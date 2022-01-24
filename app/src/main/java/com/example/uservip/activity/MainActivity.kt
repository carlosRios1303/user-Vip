package com.example.uservip.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uservip.R
import com.example.uservip.UserVipApplication.Companion.prefs
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
        checkUserValue()

    }
    private fun checkUserValue(){
        if (prefs.getName().isNotEmpty()){
            goToDetail()
        }
    }
    private fun initUI(){
        btnContinue.setOnClickListener{ accessToDetail() }
    }

    private fun accessToDetail(){
        if(etName.text.toString().isNotEmpty()){
            prefs.saveName(etName.text.toString())
            prefs.saveVIP(cbVip.isChecked)
            goToDetail()
        }else{
            // Toast?
            Toast.makeText(this , "Ingresa algo perkin", Toast.LENGTH_SHORT).show()
        }
    }
    private fun goToDetail(){
        startActivity(Intent(this,ResultActivity::class.java))
    }
}