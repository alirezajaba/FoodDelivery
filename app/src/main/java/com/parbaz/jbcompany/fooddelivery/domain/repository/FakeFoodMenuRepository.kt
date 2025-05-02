package com.parbaz.jbcompany.fooddelivery.domain.repository

import com.parbaz.jbcompany.fooddelivery.R
import com.parbaz.jbcompany.fooddelivery.domain.model.FoodMenuItem

class FakeFoodMenuRepository: FoodMenuRepository {

    override suspend fun getFoodMenuItems(): List<FoodMenuItem> {
        return listOf(
            FoodMenuItem(
                id = 1,
                name = "Hambur..",
                image = R.drawable.ic_menu_hamburger
            ),
            FoodMenuItem(
                id = 2,
                name = "Pizza",
                image = R.drawable.ic_menu_pizza
            ),
            FoodMenuItem(
                id = 3,
                name = "Noodles",
                image = R.drawable.ic_menu_noodles
            ),
            FoodMenuItem(
                id = 4,
                name = "Meat",
                image = R.drawable.ic_menu_meat
            ),
            FoodMenuItem(
                id = 5,
                name = "Vegeta..",
                image = R.drawable.ic_menu_vegetable
            ),
            FoodMenuItem(
                id = 6,
                name = "Dessert",
                image = R.drawable.ic_menu_dessert
            ),
            FoodMenuItem(
                id = 7,
                name = "Drink",
                image = R.drawable.ic_menu_drink
            ),
            FoodMenuItem(
                id = 8,
                name = "More",
                image = R.drawable.ic_menu_more
            )
        )
    }

}