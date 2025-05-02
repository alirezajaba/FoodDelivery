package com.parbaz.jbcompany.fooddelivery.presentation.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.parbaz.jbcompany.fooddelivery.domain.model.RecommendedFoodItem
import com.parbaz.jbcompany.fooddelivery.presentation.ui.screens.home.getThemeColor

@Composable
fun RecommendedFood(item: RecommendedFoodItem) {

    if (item.selected) {

        Card(
            modifier = Modifier
                .wrapContentWidth()
                .height(36.dp),
            colors = CardDefaults.cardColors(containerColor = getThemeColor()),
            shape = RoundedCornerShape(24.dp)
        ) {
            Row(modifier = Modifier
                .wrapContentWidth()
                .padding(horizontal = 8.dp)
                .padding(vertical = 4.dp)
                .align(alignment = Alignment.CenterHorizontally)

            ) {
                if(!item.picture.equals(null) && item.picture.isNotEmpty()) {
                    AsyncImage(
                        model = item.picture,
                        contentDescription = item.name,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .width(40.dp)
                            .height(40.dp)
                            .align(alignment = Alignment.CenterVertically)
                    )
                }
                Text(
                    modifier = Modifier
                        .padding(start = 8.dp),
                    text = item.name,
                    color = Color.White,
                )
                Spacer(modifier = Modifier.width(12.dp))
            }
        }
        Spacer(modifier = Modifier.height(12.dp))
        Spacer(modifier = Modifier.width(12.dp))


    }
    else{

        Card(
            modifier = Modifier
                .wrapContentWidth()
                .height(36.dp),
            colors = CardDefaults.cardColors(containerColor = getThemeColor()),
            shape = RoundedCornerShape(36.dp)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(3.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(36.dp)
            ) {
                Row(modifier = Modifier
                    .wrapContentWidth()
                    .align(alignment = Alignment.CenterHorizontally)
                ) {
                    if(!item.picture.equals(null) && item.picture.isNotEmpty()) {
                        AsyncImage(
                            model = item.picture,
                            contentDescription = item.name,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .align(alignment = Alignment.CenterVertically)
                        )
                    }
                    Text(
                        modifier = Modifier
                            .padding(start = 8.dp),
                        text = item.name,
                        color = getThemeColor(),
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Spacer(modifier = Modifier.width(12.dp))
        }

    }

}
