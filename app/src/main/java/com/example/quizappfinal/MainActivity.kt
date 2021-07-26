package com.example.quizappfinal

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.view.View
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.quizappfinal.QuestionsActivity
import com.example.quizappfinal.DeveloperActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startbutton = findViewById(R.id.button) as Button?
        val aboutbutton = findViewById(R.id.button2) as Button?
        val nametext = findViewById(R.id.editName) as EditText?
        startbutton!!.setOnClickListener {
            val name = nametext!!.text.toString()
            val intent = Intent(applicationContext, QuestionsActivity::class.java)
            intent.putExtra("myname", name)
            startActivity(intent)
        }
        aboutbutton!!.setOnClickListener {
            val intent = Intent(applicationContext, DeveloperActivity::class.java)
            startActivity(intent)
        }
    }
}