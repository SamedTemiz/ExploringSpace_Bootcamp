package com.timrashard.exploringspace_bootcamp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timrashard.exploringspace_bootcamp.R
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceLightGray
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceWhite
import com.timrashard.exploringspace_bootcamp.ui.theme.kanit

@Composable
fun SmallBioInfoCardComponent(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.cakir),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
        )

        Text(
            text = "Neil Armstrong",
            fontSize = 18.sp,
            fontFamily = kanit,
            color = SpaceWhite,
            modifier = Modifier.padding(start = 16.dp)
        )

        Spacer(modifier = Modifier.weight(1f))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.ic_star),
                contentDescription = null,
                modifier = Modifier.size(30.dp)
            )

            Row(verticalAlignment = Alignment.Bottom) {
                Text(
                    text = "4.5",
                    fontSize = 18.sp,
                    fontFamily = kanit,
                    fontWeight = FontWeight.Bold,
                    color = SpaceWhite,
                    modifier = Modifier.alignByBaseline()
                )

                Text(
                    text = "(1000+)",
                    fontSize = 12.sp,
                    fontFamily = kanit,
                    fontWeight = FontWeight.Bold,
                    color = SpaceLightGray,
                    modifier = Modifier
                        .padding(start = 4.dp)
                        .alignByBaseline()
                )
            }
        }
    }
}