package com.fahamin.jc_botomnavbar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.fahamin.jc_botomnavbar.route.RouteManage
import com.fahamin.jc_botomnavbar.screen.HomePage
import com.fahamin.jc_botomnavbar.screen.MorePage
import com.fahamin.jc_botomnavbar.screen.SettingPage
import com.fahamin.jc_botomnavbar.screen.Test

@Composable
fun NavigationScreen(navController: NavHostController) {
    NavHost(navController = navController, startDestination = RouteManage.home)
    {
        composable(route = RouteManage.home)
        {
            HomePage(navController)
        }
        composable(route = RouteManage.setting)
        {
            SettingPage()
        }
        composable(route = RouteManage.more)
        {
            MorePage(navController)
        }
        composable(route = RouteManage.testing)
        {
            Test()
        }
    }
}