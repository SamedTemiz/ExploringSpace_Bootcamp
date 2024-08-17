package com.timrashard.exploringspace_bootcamp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timrashard.exploringspace_bootcamp.R
import com.timrashard.exploringspace_bootcamp.ui.theme.kanit

@Composable
fun TopAppBarComponent(
    title: String? = null,
    profileImage: Int? = null,
    isDetailScreen: Boolean = false,
    backButtonClick: (() -> Unit)? = {}
) {
    Box(
        contentAlignment = Alignment.CenterStart,
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 32.dp)
    ) {
        if (!isDetailScreen) {
            MainTopBar(
                title = title ?: stringResource(id = R.string.welcome_message_default),
                profileImage = profileImage ?: R.drawable.ic_person
            )
        } else {
            DetailTopBar(
                backButtonClick = {
                    if (backButtonClick != null) {
                        backButtonClick()
                    }
                }
            )
        }
    }
}

@Composable
fun MainTopBar(
    title: String,
    profileImage: Int
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
            fontFamily = kanit,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )

        Image(
            painter = painterResource(id = profileImage),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
        )
    }
}

@Composable
fun DetailTopBar(
    backButtonClick: () -> Unit = {}
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_left_arrow),
                contentDescription = "Back",
                tint = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier
                    .size(24.dp)
                    .clickable {
                        backButtonClick()
                    }
            )
            Text(
                text = stringResource(id = R.string.back_button),
                color = MaterialTheme.colorScheme.onBackground,
                fontSize = 24.sp,
                modifier = Modifier.padding(start = 16.dp)
            )
        }

        Icon(
            painter = painterResource(id = R.drawable.ic_bookmark),
            contentDescription = "Bookmark",
            tint = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.size(36.dp)
        )
    }
}

@Preview
@Composable
fun TopAppBarComponentPreview() {
    TopAppBarComponent(title = "Back", isDetailScreen = true)
}