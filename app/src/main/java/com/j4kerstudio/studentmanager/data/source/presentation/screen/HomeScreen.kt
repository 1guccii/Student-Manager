package com.j4kerstudio.studentmanager.presentation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.j4kerstudio.studentmanager.presentation.fragment.BottomAppBar

@Composable
fun HomeScreen() {
    Scaffold(
        bottomBar = { BottomAppBar() },
        floatingActionButton = {}

    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {

        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}