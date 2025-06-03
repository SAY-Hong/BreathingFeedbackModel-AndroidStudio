package kr.ac.duksung.breathingfeedbackmodel

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        setContentView(R.layout.activity_result)

        val result = intent.getStringExtra("result")
        (findViewById<View>(R.id.resultText) as TextView).text =
            "분석 결과: $result"
    }
}