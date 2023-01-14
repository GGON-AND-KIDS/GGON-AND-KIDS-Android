package com.example.jjol.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CreateChallenge() {

    var inputChallengeName by remember { mutableStateOf("") }

    Column {
        Spacer(modifier = Modifier.height(300.dp))

        TextField(
            value = inputChallengeName,
            onValueChange = { inputChallengeName = it },
            label = { Text(text = "챌린지 이름") },
        )
    }
}

@Composable
@Preview(showBackground = true)
fun ShowCreateChallenge() {
    CreateChallenge()
}
