package com.timrashard.exploringspace_bootcamp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timrashard.exploringspace_bootcamp.R
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceGray
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceLightGray
import com.timrashard.exploringspace_bootcamp.ui.theme.SpacePurple
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceWhite
import com.timrashard.exploringspace_bootcamp.ui.theme.kanit

@Composable
fun ExploreCardComponent(modifier: Modifier){
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(SpaceGray, shape = RoundedCornerShape(32.dp))
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .fillMaxHeight()
                .padding(horizontal = 20.dp, vertical = 16.dp)
        ) {
            Text(
                text = "Learn How To\nTravel In Space",
                fontSize = 18.sp,
                color = SpaceWhite,
                fontFamily = kanit
            )

            Text(
                text = "You can learn about\nrocket science here",
                fontFamily = kanit,
                color = SpaceLightGray,
            )

            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {}, colors = ButtonDefaults.buttonColors(
                    containerColor = SpacePurple,
                    contentColor = SpaceWhite
                )
            ) {
                Text(text = "Explore")
            }
        }

        Box(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .fillMaxHeight(0.75f)
                .aspectRatio(1f)
                .padding(end = 8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.space_shuttle),
                contentDescription = "Planet",
                modifier = Modifier.fillMaxSize()
            )

        }
    }
}

@Preview()
@Composable
fun PreviewCard(){
    ExploreCardComponent(modifier = Modifier)
}