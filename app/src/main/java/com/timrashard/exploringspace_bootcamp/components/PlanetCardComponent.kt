package com.timrashard.exploringspace_bootcamp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timrashard.exploringspace_bootcamp.R
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceBlack
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceGray
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceLightGray
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceWhite
import com.timrashard.exploringspace_bootcamp.ui.theme.kanit

@Composable
fun PlanetCardComponent(cardClick: () -> Unit = {}) {
    Box(
        modifier = Modifier
            .size(width = 300.dp, height = 375.dp)
            .clickable {
                cardClick()
            }
    ) {
        PlanetInfoComponent(modifier = Modifier.align(Alignment.BottomCenter))

        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxWidth(0.75f)
                .aspectRatio(1f)
        ) {
            Image(
                painter = painterResource(id = R.drawable.earth_1000),
                contentDescription = "Planet",
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Composable
fun PlanetInfoComponent(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(0.75f)
            .clip(shape = RoundedCornerShape(32.dp))
            .background(SpaceGray)
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .fillMaxHeight(0.60f)
        ) {
            CircleIconComponent(
                icon = R.drawable.ic_bookmark,
                background = SpaceBlack,
                tint = SpaceWhite,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(end = 16.dp)
                    .size(56.dp)
            )

            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp)
                    .align(Alignment.BottomStart)
            ) {
                Text(text = "Planet", fontSize = 18.sp, fontFamily = kanit, color = SpaceWhite)

                Text(
                    text = "The Earth",
                    fontSize = 36.sp,
                    fontFamily = kanit,
                    fontWeight = FontWeight.Bold,
                    color = SpaceWhite
                )

                Text(
                    text = "The basics knowlage of The Earth",
                    fontSize = 14.sp,
                    fontFamily = kanit,
                    color = SpaceLightGray
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    Surface(color = SpaceBlack, modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            PlanetCardComponent()
        }
    }
}
