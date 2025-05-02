package com.parbaz.jbcompany.fooddelivery.domain.repository

import com.parbaz.jbcompany.fooddelivery.domain.model.FoodMenuItem

interface FoodMenuRepository {

    suspend fun getFoodMenuItems(): List<FoodMenuItem>

}