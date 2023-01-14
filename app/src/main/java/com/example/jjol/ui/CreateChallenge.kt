package com.example.jjol.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jjol.BtnSize
import com.example.jjol.JJOLButton
import com.example.jjol.JJOLInput

private val roundedCornerShape: RoundedCornerShape = RoundedCornerShape(12.dp)

@Composable
fun CreateChallenge() {

    val inputChallengeName = remember { mutableStateOf("") }

    Column {
        Spacer(modifier = Modifier.height(250.dp))

        JJOLInput(
            state = inputChallengeName,
            text = "챌린지 이름",
            paddingTop = 0.dp,
            paddingStart = 91.dp,
            paddingEnd = 91.dp,
        )
        
        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .height(120.dp)
                .shadow(
                    elevation = 5.dp,
                    shape = roundedCornerShape
                )
                .background(
                    color = Color.White,
                    shape = roundedCornerShape
                )
        ) {

        }

        Spacer(modifier = Modifier.height(194.dp))

        JJOLButton(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally),
            text = "생성하기",
            btnSize = BtnSize.START_AND_CREATE_BTN
        ) {

        }
    }
}

@Composable
@Preview(showBackground = true)
fun ShowCreateChallenge() {
    CreateChallenge()
}
