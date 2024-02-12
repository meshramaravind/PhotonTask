package com.arvind.photontask.navigation

sealed class Screens(val route: String) {
    object HomeScreen:Screens("Home_Screen")
}