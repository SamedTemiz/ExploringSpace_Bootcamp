package com.timrashard.exploringspace_bootcamp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceBlack
import com.timrashard.exploringspace_bootcamp.ui.theme.SpaceWhite

@Composable
fun CircleIconComponent(icon: Int, background: Color?, tint: Color?, modifier: Modifier) {
    Box(
        modifier = modifier
            .clip(CircleShape)
            .background(color = background ?: SpaceBlack),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = "Bookmark",
            tint = tint ?: SpaceWhite,
            modifier = Modifier.fillMaxSize(0.6f)
        )
    }
}