package com.abdul.bajajfirstapp

import android.Manifest
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ListView
import android.widget.SimpleCursorAdapter
import androidx.appcompat.app.AppCompatActivity


class ContentProviderActivity : BasePermissionAppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_provider)

        val uriSms: Uri = ContactsContract.Contacts.CONTENT_URI
            //Uri.parse("content://sms/inbox")


        //getReadSMSPermission(requestPermissionAction(this))
        val dataCursor: Cursor =
            getContentResolver()                   //contentresolver will bring up the db & table into mem
                .query(uriSms, null, null, null, null)!! //selection -- rows, projectioin --columns
        //select * from inbox

        var from = arrayOf("display_name","name_raw_contact_id")
            //ContactsContract.CommonDataKinds.Phone.NUMBER)
            //"body")
        var to = intArrayOf(android.R.id.text1,android.R.id.text2)

        var adapter = SimpleCursorAdapter(
            this,
            android.R.layout.simple_list_item_2,
            dataCursor, from, to
        )

        var cpListView: ListView = findViewById(R.id.cpListview)
        cpListView.adapter = adapter


    }






}




