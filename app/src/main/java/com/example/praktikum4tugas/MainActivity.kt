package com.example.praktikum4tugas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.praktikum4tugas.ui.theme.Praktikum4TugasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Praktikum4TugasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    ActivitasPertama()
                }
            }
        }
    }
}
