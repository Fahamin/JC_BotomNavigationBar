package com.fahamin.jc_botomnavbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.ui.graphics.vector.ImageVector


sealed class Destination(
    val route: String,
    val title: String? = null,
    val icon: ImageVector? = null
) {
    object HomeScreen : Destination(
        route = "home_scrren",
        title = "Home",
        icon = Icons.Outlined.Home
    )

    object Favourite : Destination(
        route = "home_scrren",
        title = "Home",
        icon = Icons.Outlined.Home
    )

    object Notification : Destination(
        route = "home_scrren",
        title = "Home",
        icon = Icons.Outlined.Home
    )

}