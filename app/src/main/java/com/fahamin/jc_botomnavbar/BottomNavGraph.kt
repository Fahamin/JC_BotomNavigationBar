package com.fahamin.jc_botomnavbar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.fahamin.jc_botomnavbar.screen.HomePage
import com.fahamin.jc_botomnavbar.screen.MorePage
import com.fahamin.jc_botomnavbar.screen.SettingPage

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route)
    {
        composable(route = BottomBarScreen.Home.route)
        {
            HomePage()
        }
        composable(route = BottomBarScreen.Setting.route)
        {
            SettingPage()
        }
        composable(route = BottomBarScreen.More.route)
        {
            MorePage()
        }
    }
}