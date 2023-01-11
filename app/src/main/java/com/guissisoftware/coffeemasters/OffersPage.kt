package com.guissisoftware.coffeemasters

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.guissisoftware.coffeemasters.ui.theme.Alternative1
import com.guissisoftware.coffeemasters.ui.theme.Ternary

@Preview(showBackground = true, widthDp = 400)
@Composable
fun OffersPage(){
    Column(Modifier.verticalScroll(rememberScrollState())) {
        Offer(title = "Hello", description = "Description")
        Offer(title = "Black Friday", description = "Get 200% Off")
        Offer(title = "Welcome Gift", description = "Get 10% Off")
        Offer(title = "Bye", description = "Bye bye")
    }
}

@Composable
fun Offer(title: String, description: String) {
    Box(modifier = Modifier.padding(16.dp)){
        Image(painter = painterResource(id = R.drawable.background_pattern), contentDescription = "Background Pattern",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.matchParentSize())

        Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()) {

            Text(text = title, style = MaterialTheme.typography.h5,
            modifier = Modifier
                .padding(16.dp)
                .background(Ternary)
                .padding(16.dp))
            
            Text(text = description, style = MaterialTheme.typography.h6,
                modifier = Modifier
                    .padding(16.dp)
                    .background(Alternative1)
                    .padding(16.dp))

        }
    }
}