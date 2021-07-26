package com.example.quizappfinal

import android.content.Intent
import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    var tv: TextView? = null
    var tv2: TextView? = null
    var tv3: TextView? = null
    var btnRestart: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        tv = findViewById<View>(R.id.tvres) as TextView
        tv2 = findViewById<View>(R.id.tvres2) as TextView
        tv3 = findViewById<View>(R.id.tvres3) as TextView
        btnRestart = findViewById<View>(R.id.btnRestart) as Button
        val sb = StringBuffer()
        sb.append(
            """
    Correct answers: ${QuestionsActivity.correct}
    
    """.trimIndent()
        )
        val sb2 = StringBuffer()
        sb2.append(
            """
    Wrong Answers: ${QuestionsActivity.wrong}
    
    """.trimIndent()
        )
        val sb3 = StringBuffer()
        sb3.append(
            """
    Final Score: ${QuestionsActivity.correct}
    
    """.trimIndent()
        )
        tv!!.text = sb
        tv2!!.text = sb2
        tv3!!.text = sb3
        QuestionsActivity.correct = 0
        QuestionsActivity.wrong = 0
        btnRestart!!.setOnClickListener {
            val `in` = Intent(applicationContext, MainActivity::class.java)
            startActivity(`in`)
        }
    }
}