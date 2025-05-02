package com.parbaz.jbcompany.fooddelivery.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.parbaz.jbcompany.fooddelivery.ui.screens.home.HomeUiState

@Composable
fun FoodSection(state: HomeUiState, uiState: HomeUiState, recFoodItem: HomeUiState, foodMenuItems: HomeUiState) {

    LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {

        item {
            SpecialOffers()
            Spacer(modifier = Modifier.height(12.dp))
        }

        item {
            FoodMenuGroup(foodMenuItems.foodMenuItems)
            Spacer(modifier = Modifier.height(12.dp))
        }


        item {
            OfferCarousel(offers = uiState.offerItems)
            Spacer(modifier = Modifier.height(12.dp))
        }

        item {
            RecommendedTitle()
        }

        item{
            RecommendedFoodItem(recFoodItem.recommendedFoodItems)
        }

        item{
            FoodItemCard(state.foodOffersItems)
        }

        item { Spacer(modifier = Modifier.height(4.dp)) }
    }

}
