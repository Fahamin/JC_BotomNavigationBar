package com.fahamin.jc_botomnavbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    var route: String,
    var title: String,
    var icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = "Home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Setting : BottomBarScreen(
        route = "Setting",
        title = "Setting",
        icon = Icons.Default.Settings
    )

    object More : BottomBarScreen(
        route = "More",
        title = "More",
        icon = Icons.Default.Menu
    )
}