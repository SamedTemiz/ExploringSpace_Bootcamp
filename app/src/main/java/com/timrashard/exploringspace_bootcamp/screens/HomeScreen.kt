package com.timrashard.exploringspace_bootcamp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.timrashard.exploringspace_bootcamp.R
import com.timrashard.exploringspace_bootcamp.components.ExploreCardComponent
import com.timrashard.exploringspace_bootcamp.components.HeaderComponent
import com.timrashard.exploringspace_bootcamp.components.PlanetCardComponent
import com.timrashard.exploringspace_bootcamp.components.SearchFieldComponent
import com.timrashard.exploringspace_bootcamp.components.TopAppBarComponent

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBarComponent(title = stringResource(id = R.string.welcome_message), profileImage = R.drawable.cakir)
        },
        containerColor = MaterialTheme.colorScheme.background,
    ) { paddingValues ->
        Column(
            verticalArrangement = Arrangement.spacedBy(24.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(Modifier.height(16.dp))
            SearchFieldComponent()

            HeaderComponent()

            LazyRow(
                contentPadding = PaddingValues(horizontal = 32.dp),
                horizontalArrangement = Arrangement.spacedBy(32.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(2) {
                    PlanetCardComponent(cardClick = { navController.navigate("details") })
                }
            }

            ExploreCardComponent(
                modifier = Modifier.padding(
                    start = 32.dp,
                    end = 32.dp,
                    bottom = 24.dp
                )
            )
        }
    }
}

@Preview(showBackground = true, locale = "tr")
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}