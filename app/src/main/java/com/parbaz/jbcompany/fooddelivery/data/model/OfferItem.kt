package com.parbaz.jbcompany.fooddelivery.data.model

import androidx.compose.ui.graphics.painter.Painter

data class OfferItem(
    val id: Int,
    val title: String,
    val imageUrl: Int,
    val name: String,
    val price: Double,
    val deliverPrice: Double,
    val rating: Double,
    val reviewsCount: Int,
    val distance: String,
    val isFavorite: Boolean

)