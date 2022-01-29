package com.abdul.bajajfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FirestoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firestore)
    }

    fun firestoreHandler(view: android.view.View) {
        when(view.id){
            R.id.btn_fssend ->{
                sendDatatoFs()
            }
        }
    }

    private fun sendDatatoFs() {
    }
}