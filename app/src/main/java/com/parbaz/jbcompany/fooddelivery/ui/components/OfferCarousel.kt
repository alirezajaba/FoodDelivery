package com.parbaz.jbcompany.fooddelivery.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.parbaz.jbcompany.fooddelivery.data.model.OfferItem
import com.parbaz.jbcompany.fooddelivery.ui.screens.home.getThemeColor

@Composable
fun OfferCarousel(offers: List<OfferItem>) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            modifier = Modifier.align(Alignment.CenterStart),
            text = "Discount Guaranteed! \uD83D\uDC4C ",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Text(
            modifier = Modifier.align(Alignment.CenterEnd),
            text = "Sea All",
            color = getThemeColor(),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
    Spacer(modifier = Modifier.height(12.dp))
    LazyRow(
        contentPadding = PaddingValues(horizontal = 1.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(offers) { offer ->
            Card(
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .width(200.dp)
                    .height(280.dp)
            ) {
                Column(modifier = Modifier
                    .fillMaxHeight()
                    .align(alignment = Alignment.CenterHorizontally)
                ) {
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .width(180.dp)
                            .height(180.dp)
                            .align(alignment = Alignment.CenterHorizontally)
                            .padding(vertical = 8.dp)
                    ) {

                        Image(
                            painter = painterResource(offer.imageUrl),
                            contentDescription = offer.title,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                                .align(alignment = Alignment.CenterHorizontally)
                        )
                    }
                    Column(modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)) {
                        Text(offer.name, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                        Text("${offer.distance} | ${offer.rating} ★ (${offer.reviewsCount})", fontSize = 13.sp)

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row {
                                Text(
                                    "$${offer.price} ",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = getThemeColor()
                                )
                                Text(
                                    "| \uD83D\uDEF5 $${offer.deliverPrice}",
                                    fontSize = 13.sp
                                )
                            }

                            Icon(
                                imageVector = if (offer.isFavorite) Icons.Default.FavoriteBorder else Icons.Default.Favorite,
                                contentDescription = "Favorite Icon",
                                tint = Color.Black,
                                modifier = Modifier
                                    .size(24.dp)
                            )
                        }

                    }
                }
            }

        }
    }
}
