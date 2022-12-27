package ir.malihemoradi.composesamples.model

import ir.malihemoradi.composesamples.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Menu : NavigationItem("menu", R.drawable.ic_round_menu_24,"Menu")
    object Car : NavigationItem("car", R.drawable.ic_round_directions_car_24,"Car")
    object Home : NavigationItem("home", R.drawable.ic_round_home_24,"Home")
    object Wallet : NavigationItem("wallet", R.drawable.ic_round_account_balance_wallet_24,"Wallet")
    object User : NavigationItem("user", R.drawable.ic_round_person_24,"User")
}
