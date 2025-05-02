package com.parbaz.jbcompany.fooddelivery.presentation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.parbaz.jbcompany.fooddelivery.domain.model.RecommendedFoodItem

@Composable
fun RecommendedFoodItem(recFItems: List<RecommendedFoodItem> = emptyList()) {

    LazyRow(
        contentPadding = PaddingValues(horizontal = 1.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(recFItems.size) { index ->
            RecommendedFood(
                RecommendedFoodItem(
                    recFItems[index].id,
                    recFItems[index].name,
                    recFItems[index].picture,
                    recFItems[index].selected
                )
            )
        }
    }
}
