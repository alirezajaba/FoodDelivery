package com.parbaz.jbcompany.fooddelivery.ui.screens.home

import com.parbaz.jbcompany.fooddelivery.data.model.BottomNavItem
import com.parbaz.jbcompany.fooddelivery.data.model.FoodItem
import com.parbaz.jbcompany.fooddelivery.data.model.FoodMenuItem
import com.parbaz.jbcompany.fooddelivery.data.model.OfferItem
import com.parbaz.jbcompany.fooddelivery.data.model.RecommendedFoodItem

data class HomeUiState(

    val foodOffersItems: List<FoodItem> = emptyList(),

    val offerItems: List<OfferItem> = emptyList(),

    val recommendedFoodItems: List<RecommendedFoodItem> = emptyList(),

    val navItems: List<BottomNavItem> = emptyList(),

    val foodMenuItems: List<FoodMenuItem> = emptyList()

)
