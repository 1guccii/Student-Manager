package com.j4kerstudio.studentmanager.data.source.presentation.fragment

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CardInform() {
    Card(
        shape = RoundedCornerShape(5.dp),
        modifier = Modifier
            .width(360.dp)
            .height(80.dp)
    ) {
        Column(
            modifier = Modifier.padding(18.dp)
        ) {
            Text(text = "Hoang Duc Manh")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "23010346 ")
        }
    }
}

@Preview
@Composable
fun Preview() {
    CardInform()
}