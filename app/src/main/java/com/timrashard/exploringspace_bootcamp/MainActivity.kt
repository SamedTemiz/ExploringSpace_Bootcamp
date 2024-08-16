package com.timrashard.exploringspace_bootcamp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.timrashard.exploringspace_bootcamp.screens.DetailsScreen
import com.timrashard.exploringspace_bootcamp.screens.HomeScreen
import com.timrashard.exploringspace_bootcamp.ui.theme.ExploringSpace_BootcampTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExploringSpace_BootcampTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "home"){
                    composable("home"){
                        HomeScreen(navController = navController)
                    }

                    composable("details"){
                        DetailsScreen(navController = navController)
                    }
                }
            }
        }
    }
}