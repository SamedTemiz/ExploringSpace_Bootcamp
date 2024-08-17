package com.timrashard.exploringspace_bootcamp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.timrashard.exploringspace_bootcamp.R
import com.timrashard.exploringspace_bootcamp.components.PlanetVideoPlayCardComponent
import com.timrashard.exploringspace_bootcamp.components.PlayVideoCardComponent
import com.timrashard.exploringspace_bootcamp.components.SmallBioInfoCardComponent
import com.timrashard.exploringspace_bootcamp.components.TopAppBarComponent

@Composable
fun DetailsScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBarComponent(isDetailScreen = true, backButtonClick = {
                navController.navigate("home") {
                    popUpTo(navController.graph.startDestinationId) {
                        inclusive = true
                    }
                }
            })
        },
        containerColor = MaterialTheme.colorScheme.background,
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Box(
                Modifier
                    .padding(horizontal = 64.dp)
                    .fillMaxWidth()
                    .aspectRatio(1f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.earth_1000),
                    contentDescription = "Planet",
                    modifier = Modifier.fillMaxSize()
                )
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 32.dp, end = 32.dp, top = 16.dp)
            ) {
                PlanetVideoPlayCardComponent()

                SmallBioInfoCardComponent()

                Text(
                    text = stringResource(id = R.string.planet_detail_description),
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.fillMaxWidth()
                )

                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    item {
                        PlayVideoCardComponent(title = stringResource(id = R.string.planet_video_category1), videoCount = 2)
                    }

                    item {
                        PlayVideoCardComponent(title = stringResource(id = R.string.planet_video_category2), videoCount = 4)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, locale = "tr")
@Composable
fun DetailsScreenPreview() {
    DetailsScreen(navController = rememberNavController())
}