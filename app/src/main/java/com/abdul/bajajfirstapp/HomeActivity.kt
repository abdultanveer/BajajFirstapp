package com.abdul.bajajfirstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var name = intent.extras?.getString("sk")
        var tvHome = findViewById<TextView>(R.id.tvHome)
        tvHome.text = name
    }

    fun handleClick(view: android.view.View) {
        when(view.id){
            R.id.btnSend -> {  startDialer() }
            R.id.btnMain -> {startMain() }
        }
    }

    private fun startDialer() {
        var dialIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:21345678"))
        startActivity(dialIntent)
    }

    private fun startMain() {
        var intent: Intent    //kotlin says you can't have a variable as null
        intent = Intent(this, MainActivity::class.java)  //no need to give the word new
        intent.putExtra("ds", "divyang sharma")
        startActivity(intent)
    }
}