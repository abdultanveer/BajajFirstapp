package com.abdul.bajajfirstapp

import android.content.Intent
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
        var intent: Intent    //kotlin says you can't have a variable as null
        intent = Intent(this,MainActivity::class.java)  //no need to give the word new
        intent.putExtra("ds","divyang sharma")
        startActivity(intent)
    }
}