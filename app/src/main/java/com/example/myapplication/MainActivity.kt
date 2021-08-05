package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.amplifyframework.core.Amplify
import com.amplifyframework.core.Amplify.Storage
import java.io.File


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val a = "12"
        //val exampleFile = File(applicationContext.filesDir, "ExampleKey")
        val exampleFile = File(applicationContext.filesDir, "bbb.txt")
        exampleFile.writeText(a)


        Storage.uploadFile(
            //System.currentTimeMillis().toString(),
            "bbb.txt",
            exampleFile,
            { result -> Log.d("MyAmplifyApp", "Successfully uploaded: " + result) },
            { error -> Log.d("MyAmplifyApp", "Upload failed", error) }
        )


    }
}