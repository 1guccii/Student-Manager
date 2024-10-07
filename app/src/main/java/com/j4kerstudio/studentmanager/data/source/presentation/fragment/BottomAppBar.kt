package com.j4kerstudio.studentmanager.data.source.presentation.fragment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.j4kerstudio.studentmanager.R
import com.j4kerstudio.studentmanager.ui.theme.Typography

@Composable
fun BottomAppBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Absolute.SpaceEvenly,
        modifier = Modifier
            .background(Color(0xFFBB90BC))
            .fillMaxWidth()
            .height(80.dp)
            .background(color = Color.White, shape = RoundedCornerShape(size = 5.dp))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon (
                    imageVector = ImageVector.vectorResource(id = R.drawable.vector),
                    contentDescription = ""
                )
            }
            Text(text = "Home", style = Typography.bodySmall)

        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.vector1),
                    contentDescription = ""
                )
            }
            Text(text = "List", style = Typography.bodySmall)

        }
    }
}


@Preview
@Composable
fun BottomAppBarPreview() {
    BottomAppBar()
}
