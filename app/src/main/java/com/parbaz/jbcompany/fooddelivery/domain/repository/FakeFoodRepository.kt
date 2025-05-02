package com.parbaz.jbcompany.fooddelivery.domain.repository

import com.parbaz.jbcompany.fooddelivery.R
import com.parbaz.jbcompany.fooddelivery.domain.model.FoodItem

class FakeFoodRepository: FoodRepository {

    override suspend fun getFoodItems(): List<FoodItem> {
        return listOf(
            FoodItem(
                id = 1,
                name = "Sushi Deluxe",
                imageUrl = R.drawable.ic_sushi_deluxe,
                price = 19.99,
                rating = 4.5,
                reviewsCount = 87,
                distance = "2.5 km",
                isFavorite = true
            ),
            FoodItem(
                id = 2,
                name = "Pizza Margherita",
                imageUrl = R.drawable.ic_pizza_margherita,
                price = 13.49,
                rating = 4.7,
                reviewsCount = 112,
                distance = "1.8 km",
                isFavorite = true
            ),
            FoodItem(
                id = 3,
                name = "Red Fruit Salad",
                imageUrl = R.drawable.ic_red_fruit_salad,
                price = 11.25,
                rating = 4.3,
                reviewsCount = 64,
                distance = "3.2 km",
                isFavorite = false
            ),
            FoodItem(
                id = 3,
                name = "Mozzarella Cheese",
                imageUrl = R.drawable.ic_mozzarella_cheese,
                price = 11.25,
                rating = 4.3,
                reviewsCount = 64,
                distance = "3.2 km",
                isFavorite = true
            ),
            FoodItem(
                id = 3,
                name = "9 Dishes From Japan",
                imageUrl = R.drawable.ic_dishes_from_japan,
                price = 11.25,
                rating = 4.3,
                reviewsCount = 64,
                distance = "3.2 km",
                isFavorite = false
            )
        )
    }

}
