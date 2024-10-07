package com.j4kerstudio.studentmanager.data.source.presentation.fragment

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.j4kerstudio.studentmanager.ui.theme.Typography

@Composable
fun CardInformation() {
    Card(
        border = BorderStroke(2.dp, Color.Black),
        shape = RoundedCornerShape(5.dp),
        modifier = Modifier
            .width(300.dp)
            .height(500.dp)

    ) {
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = "Student Information", style = Typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Hoang Duc Manh")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "id Student : 23010346")
            Spacer(modifier = Modifier.height(12.dp))
            HorizontalDivider()
            CardGrade("Mathematics")
            HorizontalDivider()
            CardGrade("Physics")
            HorizontalDivider()
            CardGrade("Chemistry")
        }
    }
}

@Preview
@Composable
fun CardInformationPreview() {
    CardInformation()
}
