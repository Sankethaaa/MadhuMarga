app/src/main/java/com/example/madhumarga/MainActivity.kt

package com.example.madhumarga

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MadhuMargaApp()
        }
    }
}

@Composable
fun MadhuMargaApp() {
    var hiveName by remember { mutableStateOf("") }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text("Madhu-Marga 🐝", style = MaterialTheme.typography.headlineMedium)

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = hiveName,
                onValueChange = { hiveName = it },
                label = { Text("Enter Hive Name") }
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = { }) {
                Text("Log Hive")
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text("AI Suggestion: Maintain temperature and check for mites.")
        }
    }
}
