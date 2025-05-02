package com.parbaz.jbcompany.fooddelivery.domain.repository

import com.parbaz.jbcompany.fooddelivery.domain.model.FoodItem

interface FoodRepository {

    suspend fun getFoodItems(): List<FoodItem>

}
