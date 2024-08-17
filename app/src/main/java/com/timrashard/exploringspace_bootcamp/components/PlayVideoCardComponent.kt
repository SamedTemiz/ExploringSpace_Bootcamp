package com.timrashard.exploringspace_bootcamp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timrashard.exploringspace_bootcamp.R
import com.timrashard.exploringspace_bootcamp.ui.theme.kanit

@Composable
fun PlayVideoCardComponent(
    title: String,
    videoCount: Int
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.secondary, shape = RoundedCornerShape(24.dp))
            .padding(16.dp)
    ) {
        CircleIconComponent(
            icon = R.drawable.ic_play,
            background = MaterialTheme.colorScheme.primary,
            tint = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier
                .size(36.dp)
        )

        Column(Modifier.padding(start = 16.dp)) {
            Text(
                text = title,
                fontSize = 18.sp,
                fontFamily = kanit,
                color = MaterialTheme.colorScheme.onSecondary
            )

            Text(
                text = "$videoCount Videos",
                fontFamily = kanit,
                color = MaterialTheme.colorScheme.onTertiary
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Icon(
            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
            contentDescription = "Go",
            tint = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.size(36.dp)
        )
    }
}