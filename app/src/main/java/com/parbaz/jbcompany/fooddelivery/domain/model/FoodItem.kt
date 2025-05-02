package com.parbaz.jbcompany.fooddelivery.domain.model

data class FoodItem(
    val id: Int,
    val name: String,
    val imageUrl: Int,
    val price: Double,
    val rating: Double,
    val reviewsCount: Int,
    val distance: String,
    val isFavorite: Boolean
)
