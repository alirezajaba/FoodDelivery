package com.parbaz.jbcompany.fooddelivery.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.parbaz.jbcompany.fooddelivery.data.model.FoodMenuItem

@Composable
fun FoodMenu(item: FoodMenuItem) {

    Column(
        modifier = Modifier
            .padding(4.dp)
            .background(Color.Transparent)
    ) {
        Image(
            painter = painterResource(item.image),
            contentDescription = item.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(64.dp)
                .height(64.dp)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            text = item.name
        )
    }
}
