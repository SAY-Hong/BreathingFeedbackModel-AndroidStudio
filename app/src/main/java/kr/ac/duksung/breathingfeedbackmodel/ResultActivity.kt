package kr.ac.duksung.breathingfeedbackmodel

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class ResultActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val result = intent.getStringExtra("result")
        (findViewById<View>(R.id.resultText) as TextView).text =
            "분석 결과: $result"
    }
}