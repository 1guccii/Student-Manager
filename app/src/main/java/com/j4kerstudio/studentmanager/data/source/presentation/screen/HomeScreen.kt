package com.j4kerstudio.studentmanager.data.source.presentation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.j4kerstudio.studentmanager.data.source.presentation.fragment.BottomAppBar
import com.j4kerstudio.studentmanager.data.source.presentation.navigation.StudentNavGraph

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        modifier = Modifier.navigationBarsPadding(),
        bottomBar = { BottomAppBar(navController) },
        floatingActionButton =  {
            FloatingActionButton(
                onClick = { navController.navigate( StudentNavGraph.Write.name) },
                containerColor = MaterialTheme.colorScheme.primary // Màu của FAB
            ) {
                Icon(
                    imageVector = Icons.Default.Add, // Icon cho FAB
                    contentDescription = "Add"
                )
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
                Text(
                "Welcome to my App",
                style = Typography.displayMedium
                )

        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}
