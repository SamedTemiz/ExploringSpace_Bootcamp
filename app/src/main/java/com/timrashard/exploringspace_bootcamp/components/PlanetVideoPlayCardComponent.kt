package com.timrashard.exploringspace_bootcamp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timrashard.exploringspace_bootcamp.R
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceGray
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceWhite
import com.timrashard.exploringspace_bootcamp.ui.theme.kanit

@Composable
fun PlanetVideoPlayCardComponent(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column {
            Text(
                text = "Planet",
                fontSize = 18.sp,
                fontFamily = kanit,
                color = SpaceWhite
            )

            Text(
                text = "The Earth",
                fontSize = 36.sp,
                fontFamily = kanit,
                fontWeight = FontWeight.Bold,
                color = SpaceWhite
            )
        }

        CircleIconComponent(
            icon = R.drawable.ic_play,
            background = SpaceGray,
            tint = SpaceWhite,
            modifier = Modifier.size(48.dp)
        )
    }
}