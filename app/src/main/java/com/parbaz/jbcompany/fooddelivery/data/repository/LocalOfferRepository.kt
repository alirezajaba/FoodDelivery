package com.parbaz.jbcompany.fooddelivery.data.repository

import com.parbaz.jbcompany.fooddelivery.R
import com.parbaz.jbcompany.fooddelivery.domain.model.OfferItem
import com.parbaz.jbcompany.fooddelivery.domain.repository.OfferRepository

class LocalOfferRepository: OfferRepository {

    override suspend fun getOfferItems(): List<OfferItem> {
        return listOf(
            OfferItem(
                id = 1,
                name = "Mixed Salad Bonb..",
                imageUrl = R.drawable.ic_mixed_salad_bonb,
                price = 6.00,
                rating = 4.5,
                reviewsCount = 87,
                distance = "2.5 km",
                title = "Special Offers",
                deliverPrice = 2.00,
                isFavorite = false
            ),
            OfferItem(
                id = 2,
                name = "Vegetarian Menu",
                imageUrl = R.drawable.ic_vegetarian_menu,
                price = 5.50,
                rating = 4.7,
                reviewsCount = 112,
                distance = "1.8 km",
                title = "Special Offers",
                deliverPrice = 2.36,
                isFavorite = true
            ),
            OfferItem(
                id = 3,
                name = "Vegan Bowl",
                imageUrl = R.drawable.ic_vegan_bowl,
                price = 7.19,
                rating = 4.6,
                reviewsCount = 64,
                distance = "3.8 km",
                title = "Special Offers",
                deliverPrice = 3.17,
                isFavorite = true
            ),
            OfferItem(
                id = 4,
                name = "Peperoni Pizza",
                imageUrl = R.drawable.ic_peperoni_pizza,
                price = 6.43,
                rating = 4.7,
                reviewsCount = 89,
                distance = "3.2 km",
                title = "Special Offers",
                deliverPrice = 1.99,
                isFavorite = false
            ),
            OfferItem(
                id = 5,
                name = "Ricotta Pizza",
                imageUrl = R.drawable.ic_ricotta_pizza,
                price = 11.25,
                rating = 4.3,
                reviewsCount = 47,
                distance = "3.6 km",
                title = "Special Offers",
                deliverPrice = 1.87,
                isFavorite = false
            )
        )
    }

}