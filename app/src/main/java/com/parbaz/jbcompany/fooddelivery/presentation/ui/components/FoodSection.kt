package com.parbaz.jbcompany.fooddelivery.presentation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.parbaz.jbcompany.fooddelivery.domain.model.FoodItem
import com.parbaz.jbcompany.fooddelivery.domain.model.FoodMenuItem
import com.parbaz.jbcompany.fooddelivery.domain.model.OfferItem
import com.parbaz.jbcompany.fooddelivery.domain.model.RecommendedFoodItem

@Composable
fun FoodSection(foods: List<FoodItem>,
                offers: List<OfferItem>,
                recommendedFoods: List<RecommendedFoodItem>,
                foodMenu: List<FoodMenuItem>
) {

    LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {

        item {
            SpecialOffers()
            Spacer(modifier = Modifier.height(12.dp))
        }

        item {
            FoodMenuGroup(foodMenu)
            Spacer(modifier = Modifier.height(12.dp))
        }


        item {
            OfferCarousel(offers = offers)
            Spacer(modifier = Modifier.height(12.dp))
        }

        item {
            RecommendedTitle()
        }

        item{
            RecommendedFoodItem(recommendedFoods)
        }

        item{
            FoodItemCard(foods)
        }

        item { Spacer(modifier = Modifier.height(4.dp)) }
    }

}
