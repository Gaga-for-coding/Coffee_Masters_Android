package com.guissisoftware.coffeemasters

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.guissisoftware.coffeemasters.ui.theme.CoffeeMastersTheme

@Preview
@Composable
fun App_Preview() {
    CoffeeMastersTheme {
        App()
    }
}


@Composable
fun App() {
    Scaffold(topBar = { TopAppBar {
        AppTitle()
    } },
    bottomBar = {})
    {
        OffersPage()
    }
}


@Composable
fun AppTitle() {
    Box(contentAlignment = Alignment.Center ,modifier = Modifier.fillMaxWidth()) {
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "coffee_masters logo")
    }

}