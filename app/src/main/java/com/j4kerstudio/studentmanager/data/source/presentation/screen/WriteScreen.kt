package com.j4kerstudio.studentmanager.data.source.presentation.screen

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.j4kerstudio.studentmanager.data.source.presentation.fragment.BottomAppBar
import com.j4kerstudio.studentmanager.data.source.presentation.fragment.TextFieldBox
import com.j4kerstudio.studentmanager.data.source.presentation.navigation.StudentNavGraph

@Composable
fun WriteScreen(navController: NavController) {
    val context = LocalContext.current // Lấy context đúng cách

    var showToast by remember { mutableStateOf(false) } // Biến để điều khiển Toast

    if (showToast) {
        // Sử dụng LaunchedEffect để hiện Toast
        LaunchedEffect(Unit) {
            Toast.makeText(context,"Submit Success!", Toast.LENGTH_SHORT).show()
            showToast = false // Ẩn Toast sau khi hiển thị
        }
    }

    Scaffold(
        bottomBar = { BottomAppBar(navController) },
        modifier = Modifier.navigationBarsPadding(),
        floatingActionButton =  {
            FloatingActionButton(
                onClick = { navController.navigate(StudentNavGraph.SEARCH.name) },
                containerColor = MaterialTheme.colorScheme.primary // Màu của FAB
            ) {
                Icon(
                    imageVector = Icons.Default.Person, // Icon cho FAB
                    contentDescription = "Add"
                )
            }
        }
        
    ) { innerPadding ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
        ) {
            TextFieldBox(label = "id Student")
            Spacer(modifier = Modifier.height(50.dp))
            TextFieldBox(label = "Full Name")
            Spacer(modifier = Modifier.height(50.dp))
            TextFieldBox(label = "Mathematics")
            Spacer(modifier = Modifier.height(50.dp))
            TextFieldBox(label = "Physics")
            Spacer(modifier = Modifier.height(50.dp))
            TextFieldBox(label = "Chemistry")
            Spacer(modifier = Modifier.height(60.dp))
            Button(onClick = { showToast = true } ) {
                Text(text = "Submit")
            }
        }
    }
}

@Preview
@Composable
fun WriteScreenPreview() {
    WriteScreen(navController = rememberNavController())
}