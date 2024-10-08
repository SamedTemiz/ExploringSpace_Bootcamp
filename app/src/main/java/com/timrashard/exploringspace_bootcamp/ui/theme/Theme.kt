package com.timrashard.exploringspace_bootcamp.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = SpacePrimary,
    secondary = SpaceSecondary,
    tertiary = SpaceTertiary,
    background = SpaceBackground,
    onPrimary = SpaceWhite,
    onSecondary = SpaceWhite,
    onTertiary = SpaceWhite,
    onBackground = SpaceWhite
)

private val LightColorScheme = lightColorScheme(
    primary = LightSpacePrimary,
    secondary = LightSpaceSecondary,
    tertiary = LightSpaceTertiary,
    background = LightSpaceBackground,
    onPrimary = SpaceWhite,
    onSecondary = SpaceWhite,
    onTertiary = SpaceWhite,
    onBackground = LightSpaceFont
)

@Composable
fun ExploringSpace_BootcampTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}