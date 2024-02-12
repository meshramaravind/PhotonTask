package com.arvind.photontask.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.arvind.photontask.screen.HomeScreen

@Composable
fun Navigation() {
    val navigationControl = rememberNavController()
    NavHost(
        navController = navigationControl,
        startDestination = Screens.HomeScreen.route
    ) {
        composable(Screens.HomeScreen.route) {
            HomeScreen()
        }
    }

}