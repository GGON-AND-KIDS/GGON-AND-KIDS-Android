package com.example.jjol.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.jjol.BtnSize
import com.example.jjol.JJOLButton
import com.example.jjol.R
import com.example.jjol.ui.theme.primary

@Composable
fun ChallengeScreen() {

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .verticalScroll(scrollState)
    ) {
        Spacer(modifier = Modifier.height(60.dp))

        JJOLButton(
            modifier = Modifier
                .padding(start = 40.dp),
            text = "뒤로",
            btnSize = BtnSize.PREVIOUS_BTN,
        ) {
            
        }
        
        Spacer(modifier = Modifier.height(40.dp))

        Image(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .size(60.dp)
                .background(
                    color = primary,
                    shape = CircleShape,
                ),
            contentScale = ContentScale.Inside,
            painter = painterResource(id = R.mipmap.challenge),
            contentDescription = null,
        )
        
        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .padding(horizontal = 58.dp)
                .shadow(
                    elevation = 5.dp,
                    shape = RoundedCornerShape(15.dp),
                )
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(15.dp),
                )
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .height(118.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                fontStyle = FontStyle(R.font.nunito_sans_light),
                text = "플레이어는 원하는 시간대를 설정한 후\n설정한 시간이 되었다고 생각이 들 때\n화면을 터치하여 결과를 확인하는 게임",
                textAlign = TextAlign.Center,
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        ChallengeList(
            list = listOf(),
            title = "챌린지 리스트",
            state = ChallengeState.ShowTime,
            onItemClicked = {},
        )

        Spacer(modifier = Modifier.height(30.dp))

        ChallengeList(
            list = listOf(),
            title = "챌린지 랭킹",
            state = ChallengeState.ShowRank,
            onItemClicked = {},
        )
    }
}

@Composable
fun ChallengeList(
    list: List<ChallengeListData>,
    title: String,
    state: ChallengeState,
    onItemClicked: () -> Unit
) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(
                    color = primary,
                ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Spacer(modifier = Modifier.width(20.dp))
            
            Text(
                text = title,
                color = Color.White,
                fontStyle = FontStyle(R.font.nunito_sans_lightㅅ)
            )
        }
    }
}

enum class ChallengeState() {
    ShowTime,
    ShowRank,
}

data class ChallengeListData (
    val imageUrl: String?,
    val title: String,
    val content: String,
    val time: Int
)
