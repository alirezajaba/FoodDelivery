package com.parbaz.jbcompany.fooddelivery.domain.model

data class RecommendedFoodItem(

    val id: Int,
    val name: String,
    val picture: String,
    val selected: Boolean,

)