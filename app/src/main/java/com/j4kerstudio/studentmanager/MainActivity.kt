package com.j4kerstudio.studentmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.j4kerstudio.studentmanager.data.source.presentation.navigation.StudentNavHost
import com.j4kerstudio.studentmanager.data.source.presentation.screen.WriteScreen
import com.j4kerstudio.studentmanager.ui.theme.StudentManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudentManagerTheme {
                StudentNavHost(navController = rememberNavController())
            }
        }
    }
}
