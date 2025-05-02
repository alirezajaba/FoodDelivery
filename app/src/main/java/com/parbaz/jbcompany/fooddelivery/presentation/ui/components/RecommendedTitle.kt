package com.parbaz.jbcompany.fooddelivery.presentation.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.parbaz.jbcompany.fooddelivery.presentation.ui.screens.home.getThemeColor

@Composable
fun RecommendedTitle() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            modifier = Modifier.align(Alignment.CenterStart),
            text = "Recommended For You \uD83D\uDE0D",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
        )

        Text(
            modifier = Modifier.align(Alignment.CenterEnd),
            text = "Sea All",
            color = getThemeColor(),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
