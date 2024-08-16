package com.timrashard.exploringspace_bootcamp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceGray
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceLightGray
import com.timrashard.exploringspace_bootcamp.ui.theme.SpacePurple
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceWhite

@Composable
fun SearchFieldComponent(){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .height(75.dp)
            .padding(horizontal = 32.dp)
            .background(color = SpaceGray, shape = RoundedCornerShape(50.dp))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = "Filter",
                tint = SpaceWhite,
                modifier = Modifier
                    .size(50.dp)
                    .padding(start = 16.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "Search Anything...",
                fontSize = 18.sp,
                color = SpaceLightGray,
                modifier = Modifier.weight(1f)
            )

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape),
                contentPadding = PaddingValues(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = SpacePurple,
                    contentColor = SpaceWhite
                )
            ) {
                Icon(
                    imageVector = Icons.Filled.Settings,
                    contentDescription = "Filter",
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
        }

    }
}