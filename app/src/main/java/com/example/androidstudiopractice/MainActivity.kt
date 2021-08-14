package com.example.androidstudiopractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn:Button = findViewById(R.id.tap_btn)
        btn.setOnClickListener{
            Toast.makeText(this, "Toast!!", Toast.LENGTH_LONG).show()
        }
    }
}

