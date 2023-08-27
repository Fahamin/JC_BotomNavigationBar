package com.fahamin.jc_botomnavbar

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomBar(
    navController: NavController,
    state: MutableState<Boolean>,
    modifier: Modifier = Modifier
) {
    val screen = listOf(
        Destination.HomeScreen,
        Destination.Favourite,
        Destination.Notification
    )
    NavigationBar(modifier = Modifier,
        containerColor = Color.LightGray,
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        screen.forEach{
            screen->
            NavigationBarItem(selected = currentRoute==screen.route,
                onClick = { navController.navigate(screen.route)
                {
                    popUpTo(navController.graph.findStartDestination().id)
                    {
                        saveState=true
                    }
                    launchSingleTop = true
                    restoreState = true
                }}, icon = { Icon(imageVector = screen.icon!!,
                    contentDescription = "") })
        }
    }
}