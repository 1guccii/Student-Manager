package com.j4kerstudio.studentmanager.presentation.screen

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text2.BasicTextField2
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.j4kerstudio.studentmanager.presentation.fragment.BottomAppBar
import com.j4kerstudio.studentmanager.presentation.fragment.CardGrade
import com.j4kerstudio.studentmanager.presentation.fragment.CardInformation

@Composable
fun SearchScreen() {

}

@Preview
@Composable
fun SearchScreenPreview() {
    Scaffold(
        bottomBar = {BottomAppBar()}
    ) { innerPadding->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.weight(1f))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Id Student")}
            )
            Spacer(modifier = Modifier.weight(2f))
            CardInformation()
            Spacer(modifier = Modifier.weight(3f))
        }
    }
}
