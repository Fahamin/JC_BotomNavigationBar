package com.fahamin.jc_botomnavbar.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.fahamin.jc_botomnavbar.route.RouteManage

@Composable
fun MorePage(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Button(onClick = {
                navController.navigate(
                    route = RouteManage.testing){
                    launchSingleTop
                    popUpTo(route = RouteManage.home)
                    {
                        inclusive = true
                    }
                }
            }) {
                Text(text = "gotoTestPage")
            }
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "More",
                fontSize = MaterialTheme.typography.titleMedium.fontSize,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

    }
}

@Composable
@Preview
fun MorePagePreview(navController: NavController) {
    MorePage(navController)
}