package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //OnCreate basically occurs when the app launches
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainButton = findViewById<Button>(R.id.hellobutton)

        // onClickListener is for button click
        mainButton.setOnClickListener{
            Log.v("Hello world","Button clicked!")
            Toast.makeText(this,"Hello to you!",Toast.LENGTH_SHORT).show()
        //toast is the little popup widget, context is this meaning the activity
        }
    }
}