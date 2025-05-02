package com.parbaz.jbcompany.fooddelivery.domain.repository

import com.parbaz.jbcompany.fooddelivery.domain.model.RecommendedFoodItem

interface RecommendedFoodRepository {

    suspend fun getRecommendedFoodItems(): List<RecommendedFoodItem>

}