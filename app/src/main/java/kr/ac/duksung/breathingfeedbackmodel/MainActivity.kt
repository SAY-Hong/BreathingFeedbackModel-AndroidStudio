package kr.ac.duksung.breathingfeedbackmodel

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kr.ac.duksung.breathingfeedbackmodel.ui.theme.BreathingFeedbackModelTheme


class MainActivity : ComponentActivity() {
    private var recorder: AudioRecorder? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BreathingFeedbackModelTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }

        setContentView(R.layout.activity_main)

        val startBtn: Button = findViewById(R.id.startButton)
        recorder = AudioRecorder(this)

        startBtn.setOnClickListener { v: View? -> recorder!!.startRecording() }
    }

    companion object {
        private const val PERMISSION_REQUEST_CODE = 1001
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BreathingFeedbackModelTheme {
        Greeting("Android")
    }
}

