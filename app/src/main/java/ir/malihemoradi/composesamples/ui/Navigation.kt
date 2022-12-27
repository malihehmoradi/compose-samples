package ir.malihemoradi.composesamples.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ir.malihemoradi.composesamples.model.NavigationItem

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController =navController , startDestination = NavigationItem.Home.route ){
        composable(NavigationItem.Menu.route){
            HomeScreen()
        }
        composable(NavigationItem.Car.route){
            CarScreen()
        }
        composable(NavigationItem.Home.route){
            HomeScreen()
        }
        composable(NavigationItem.Wallet.route){
            WalletScreen()
        }
        composable(NavigationItem.User.route){
            UserScreen()
        }
    }
}