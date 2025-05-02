package com.parbaz.jbcompany.fooddelivery.data.repository

import com.parbaz.jbcompany.fooddelivery.domain.model.RecommendedFoodItem
import com.parbaz.jbcompany.fooddelivery.domain.repository.RecommendedFoodRepository

class LocalRecommendedFoodRepository: RecommendedFoodRepository {

    override suspend fun getRecommendedFoodItems(): List<RecommendedFoodItem> {
        return listOf(
            RecommendedFoodItem(
                id = 1,
                name = "✅\uFE0F All",
                picture = "",
                selected = true
            ),
            RecommendedFoodItem(
                id = 2,
                name = "\uD83C\uDF54 Hamburger",
                picture = "",
                selected = false
            ),
            RecommendedFoodItem(
                id = 3,
                name = "\uD83C\uDF55 Pizza",
                picture = "",
                selected = false
            ),
            RecommendedFoodItem(
                id = 4,
                name = "\uD83C\uDF79 Drink",
                picture = "",
                selected = false
            ),
            RecommendedFoodItem(
                id = 5,
                name = "\uD83C\uDF70 Dessert",
                picture = "",
                selected = false
            ),
            RecommendedFoodItem(
                id = 6,
                name = "\uD83C\uDF5C Noodles",
                picture = "",
                selected = false
            )
        )
    }

}