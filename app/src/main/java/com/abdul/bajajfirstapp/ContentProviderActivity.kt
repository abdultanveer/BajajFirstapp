package com.abdul.bajajfirstapp

import android.database.Cursor
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ContentProviderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_provider)

        val uriSms: Uri = Uri.parse("content://sms/inbox")
        val cursor: Cursor = getContentResolver()                   //contentresolver will bring up the db & table into mem
            .query(uriSms, null, null, null, null)!! //selection -- rows, projectioin --columns
        //select * from inbox
        


    }
}