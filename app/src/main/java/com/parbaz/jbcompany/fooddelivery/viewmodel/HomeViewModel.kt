package com.parbaz.jbcompany.fooddelivery.viewmodel

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.lifecycle.ViewModel
import com.parbaz.jbcompany.fooddelivery.R
import com.parbaz.jbcompany.fooddelivery.data.model.BottomNavItem
import com.parbaz.jbcompany.fooddelivery.data.model.FoodItem
import com.parbaz.jbcompany.fooddelivery.data.model.FoodMenuItem
import com.parbaz.jbcompany.fooddelivery.data.model.OfferItem
import com.parbaz.jbcompany.fooddelivery.data.model.RecommendedFoodItem
import com.parbaz.jbcompany.fooddelivery.ui.screens.home.HomeUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {

    private val _offerItem = MutableStateFlow(HomeUiState())
    val offerItem: StateFlow<HomeUiState> = _offerItem

    private val _foodItem = MutableStateFlow(HomeUiState())
    val foodItem: StateFlow<HomeUiState> = _foodItem

    private val _recommendedFoodItems = MutableStateFlow(HomeUiState())
    val recommendedFoodItems: StateFlow<HomeUiState> = _recommendedFoodItems

    private val _navItems = MutableStateFlow(HomeUiState())
    val navItems: StateFlow<HomeUiState> = _navItems

    private val _foodMenuItems = MutableStateFlow(HomeUiState())
    val foodMenuItems: StateFlow<HomeUiState> = _foodMenuItems



    /**
     *  Initialize Food Items Data into
     *  ### foodItem
     **/
    init {
        _foodItem.value = HomeUiState(
            foodOffersItems = listOf(
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
        )
    }

    /**
     *  Initialize Offer Items Data into
     *  ### offerItem
     **/
    init {
        _offerItem.value = HomeUiState(
            offerItems = listOf(
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
        )
    }

    /**
     *  Initialize Food Menu Items into
     *  ### foodMenuItems
     **/
    init {
        _foodMenuItems.value = HomeUiState(
            foodMenuItems = listOf(
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
        )
    }

    /**
     *  Initialize Recommended Food Items into
     *  ### recommendedFoodItems
     **/
    init {
        _recommendedFoodItems.value = HomeUiState(
            recommendedFoodItems = listOf(
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
        )
    }

    /**
     *  Initialize Bottom Navigation Items into
     *  ### navItems
     **/
    init {
        _navItems.value = HomeUiState(
            navItems = listOf(
                BottomNavItem(
                    id = 1,
                    label = "Home",
                    icon = Icons.Default.Home
                ),
                BottomNavItem(
                    id = 2,
                    label = "Orders",
                    icon = Icons.Default.DateRange
                ),
                BottomNavItem(
                    id = 3,
                    label = "Message",
                    icon = Icons.Default.Email
                ),
                BottomNavItem(
                    id = 4,
                    label = "E-Wallet",
                    icon = Icons.Default.ShoppingCart
                ),
                BottomNavItem(
                    id = 5,
                    label = "Profile",
                    icon = Icons.Default.Person
                )
            )
        )
    }
}

