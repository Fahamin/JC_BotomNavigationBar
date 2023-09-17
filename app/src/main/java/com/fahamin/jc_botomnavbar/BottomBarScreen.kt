package com.fahamin.jc_botomnavbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.fahamin.jc_botomnavbar.route.RouteManage

sealed class BottomBarScreen(
    var route: String,
    var title: String,
    var icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = RouteManage.home,
        title = "Home",
        icon = Icons.Default.Home
    )

    object Setting : BottomBarScreen(
        route = RouteManage.setting,
        title = "Setting",
        icon = Icons.Default.Settings
    )

    object More : BottomBarScreen(
        route = RouteManage.more,
        title = "More",
        icon = Icons.Default.Menu
    )
}