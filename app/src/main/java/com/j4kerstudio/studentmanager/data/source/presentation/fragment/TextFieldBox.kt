package com.j4kerstudio.studentmanager.data.source.presentation.fragment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldBox(label: String) {
    var text by remember { mutableStateOf("") }
    TextField(
        value = text,
        onValueChange = { newText -> text = newText},
        label = { Text(text = label) },
        singleLine = true
    )
}

@Preview
@Composable
fun TextFieldPreview() {
    TextFieldBox(label = "Hello")
}
