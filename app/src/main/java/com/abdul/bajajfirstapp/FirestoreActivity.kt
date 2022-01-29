package com.abdul.bajajfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class FirestoreActivity : AppCompatActivity() {
    var TAG:String = FirestoreActivity::class.java.simpleName

    lateinit var titleEditText: EditText
    lateinit var notesEditText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firestore)

        titleEditText = findViewById(R.id.etTitle)
        notesEditText = findViewById(R.id.etNotes)
    }

    fun firestoreHandler(view: android.view.View) {
        when(view.id){
            R.id.btn_fssend ->{
                sendDatatoFs()
            }
        }
    }

    private fun sendDatatoFs() {
        val db = Firebase.firestore
        var title = titleEditText.text.toString()
        var notes = notesEditText.text.toString()
        val user = hashMapOf(
            "first" to "Abdul",
            "last" to "Ansari",
            "born" to 1815
        )

        // Add a new document with a generated ID
        db.collection("users")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w(TAG, "Error adding document", e)
            }
    }
}