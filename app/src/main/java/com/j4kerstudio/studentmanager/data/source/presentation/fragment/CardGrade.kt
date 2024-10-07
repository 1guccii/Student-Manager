package com.j4kerstudio.studentmanager.data.source.presentation.fragment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.j4kerstudio.studentmanager.ui.theme.Typography

@Composable
fun CardGrade(title: String) {
    Card(
        modifier = Modifier
            .width(285.dp)
            .height(100.dp)
            .padding(top = 12.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxHeight()
            ) {
                Text(text = title, style = Typography.bodyLarge)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "9.2")
            }
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "A", style = Typography.bodyMedium)
        }
    }
}
@Composable
@Preview
fun CardGradePreview() {
    CardGrade("English")
}