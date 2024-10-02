package com.j4kerstudio.studentmanager.presentation.screen


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.j4kerstudio.studentmanager.ui.theme.Typography

@Composable
fun TextFieldScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(Color(0xFFF0F0F0))
    ) {
        var text by remember { mutableStateOf("") }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(8f)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Spacer(modifier = Modifier.weight(1f))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(Color.White, shape = RoundedCornerShape(15.dp))
                    .width(366.dp)
                    .height(60.dp)
            ) {
                Text(
                    text = "Let’s type your id student ?",
                    style = Typography.bodyMedium,
                    minLines = 1,
                    modifier = Modifier.padding(20.dp)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            BasicTextField(
                value = text,
                singleLine = true,
                onValueChange = { newText -> text = newText },
                modifier = Modifier
                    .width(330.dp)
                    .height(60.dp)
                    .background(Color.White, shape = RoundedCornerShape(10.dp))
                    .fillMaxHeight(),
                keyboardOptions = KeyboardOptions.Default,
                textStyle = TextStyle(
                    textAlign = TextAlign.Start, // Căn giữa văn bản
                    fontSize = 16.sp
                ),
                keyboardActions = KeyboardActions.Default,
                decorationBox = { innerTextField -> // Tuỳ chỉnh hộp trang trí
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 16.dp, end = 16.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        if (text.isEmpty()) { // Hiển thị label nếu văn bản rỗng
                            Text(
                                text = "Enter your id student",
                                style = TextStyle(fontSize = 16.sp, color = Color.LightGray)
                            )
                        }
                        innerTextField() // Gọi trường văn bản
                    }
                }
            )
            Spacer(modifier = Modifier.weight(2f))
        }
        Column(
            modifier = Modifier.weight(2f)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonColors(
                    containerColor = Color.Black,
                    contentColor = Color(0xFFFFFFFF),
                    disabledContentColor = Color(0xFF3A51FF),
                    disabledContainerColor = Color(0xFF3A51FF)
                ),
                modifier = Modifier
                    .width(300.dp)
                    .height(60.dp)
                    .background(Color.White, shape = RoundedCornerShape(20.dp))
            ) {
                Text(
                    text = "Continue",
                    style = Typography.bodyMedium.copy(color = Color.White)
                )
            }
            Spacer(modifier = Modifier.weight(1f))

        }
    }
}
@Preview
@Composable
fun TextFieldScreenPreview() {
    TextFieldScreen()
}