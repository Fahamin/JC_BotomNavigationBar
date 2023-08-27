package com.fahamin.jc_botomnavbar

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.fahamin.jc_botomnavbar.screen.FavouriteScreen
import com.fahamin.jc_botomnavbar.screen.HomeScreen
import com.fahamin.jc_botomnavbar.screen.NotificationScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Destination.HomeScreen.route) {
        composable(Destination.HomeScreen.route) {
            HomeScreen()
        }
        composable(Destination.Favourite.route) {
            FavouriteScreen()
        }
        composable(Destination.Notification.route) {
            NotificationScreen()
        }
    }
}