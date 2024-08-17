package com.timrashard.exploringspace_bootcamp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timrashard.exploringspace_bootcamp.R
import com.timrashard.exploringspace_bootcamp.ui.theme.ExploringSpace_BootcampTheme
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
            .background(MaterialTheme.colorScheme.secondary)
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .fillMaxHeight(0.60f)
        ) {
            CircleIconComponent(
                icon = R.drawable.ic_bookmark,
                background = MaterialTheme.colorScheme.background,
                tint = MaterialTheme.colorScheme.onBackground,
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
                Text(
                    text = stringResource(id = R.string.planet_card_type),
                    fontSize = 18.sp,
                    fontFamily = kanit,
                    color = MaterialTheme.colorScheme.onSecondary
                )

                Text(
                    text = stringResource(id = R.string.planet_card_header),
                    fontSize = 36.sp,
                    fontFamily = kanit,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSecondary
                )

                Text(
                    text = stringResource(id = R.string.planet_short_description),
                    fontSize = 14.sp,
                    fontFamily = kanit,
                    color = MaterialTheme.colorScheme.tertiary
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    ExploringSpace_BootcampTheme {
        Surface(color = MaterialTheme.colorScheme.background, modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                PlanetCardComponent()
            }
        }
    }
}
