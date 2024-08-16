package com.timrashard.exploringspace_bootcamp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timrashard.exploringspace_bootcamp.R
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceLightGray
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceWhite
import com.timrashard.exploringspace_bootcamp.ui.theme.kanit

@Composable
fun HeaderComponent(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Popular Now",
                fontSize = 30.sp,
                fontFamily = kanit,
                color = SpaceWhite,
            )

            Image(
                painter = painterResource(id = R.drawable.flame),
                contentDescription = "Filter",
                modifier = Modifier
                    .size(36.dp)
                    .padding(start = 8.dp)
            )
        }

        Text(
            text = "See all",
            fontSize = 18.sp,
            fontFamily = kanit,
            color = SpaceLightGray
        )
    }
}