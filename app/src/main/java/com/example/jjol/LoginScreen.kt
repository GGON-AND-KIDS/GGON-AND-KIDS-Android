package com.example.jjol

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jjol.ui.theme.primary

@Composable
fun LoginScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val idState = remember {
            mutableStateOf("")
        }
        val passwordState = remember {
            mutableStateOf("")
        }

        Image(
            modifier = Modifier.padding(top = 130.dp),
            painter = painterResource(id = R.mipmap.logo),
            contentDescription = null,
        )
        JJOLInput(
            state = idState,
            text = "name",
            paddingTop = 36.dp
        )
        JJOLInput(
            state = passwordState,
            text = "password",
            paddingTop = 20.dp
        )
        Box(
            modifier = Modifier
                .padding(top = 30.dp)
                .shadow(
                    elevation = 5.dp,
                    shape = RoundedCornerShape(60.dp)
                )
                .background(color = primary, shape = RoundedCornerShape(60.dp))
                .height(50.dp),
            contentAlignment = Alignment.Center
        ) {
            JJOLButton(
                text = "GO",
                btnSize = BtnSize.GO_BTN,
                onClick = {  }
            )
        }
        Image(
            modifier = Modifier.padding(top = 60.dp),
            painter = painterResource(id = R.mipmap.character),
            contentDescription = null,
        )
    }
}

@Composable
fun JJOLInput(
    state: MutableState<String>,
    text: String,
    paddingTop: Dp
) {
    Box(
        modifier = Modifier
            .padding(top = paddingTop, start = 40.dp, end = 40.dp)
            .shadow(
                elevation = 5.dp,
                shape = RoundedCornerShape(30.dp)
            )
            .background(color = Color.White, shape = RoundedCornerShape(30.dp))
            .fillMaxWidth()
            .height(50.dp),
        contentAlignment = Alignment.Center
    ) {
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(30.dp)),
            value = state.value,
            placeholder = { Text(text) },
            onValueChange = { idValue -> state.value = idValue },
            textStyle = TextStyle(
                color = Color.Black,
                fontStyle = FontStyle(R.font.nunito_sans_light)
            ),
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Gray,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                backgroundColor = Color.White
            )
        )
    }
}