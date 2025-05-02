package com.parbaz.jbcompany.fooddelivery.presentation.ui.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.parbaz.jbcompany.fooddelivery.domain.model.FoodItem
import com.parbaz.jbcompany.fooddelivery.domain.model.FoodMenuItem
import com.parbaz.jbcompany.fooddelivery.domain.model.OfferItem
import com.parbaz.jbcompany.fooddelivery.domain.model.RecommendedFoodItem
import com.parbaz.jbcompany.fooddelivery.presentation.ui.components.FoodSection
import com.parbaz.jbcompany.fooddelivery.presentation.ui.components.Profile
import com.parbaz.jbcompany.fooddelivery.presentation.ui.theme.FoodDeliveryTheme
import com.parbaz.jbcompany.fooddelivery.presentation.ui.components.SearchBar
import com.parbaz.jbcompany.fooddelivery.presentation.viewmodel.HomeViewModel


@Composable
fun MainScreen(modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {

    val offers by viewModel.offers.collectAsState()
    val foods by viewModel.foods.collectAsState()
    val navigation by viewModel.navigation.collectAsState()
    val foodMenu by viewModel.foodMenu.collectAsState()
    val recommendedFoods by viewModel.recommendedFoods.collectAsState()

    var selectedIndex by remember { mutableIntStateOf(0) }

    val navItems = navigation

    Scaffold(modifier = Modifier
        .fillMaxSize()
        .padding(12.dp),
        bottomBar = {
            NavigationBar {
                navItems.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = {
                            selectedIndex = index
                        },
                        icon = { Icon(item.icon, contentDescription = item.label) },
                        label = { Text(item.label) }
                    )
                }
            }
        }
    ){ innerPadding ->
        ContentScreen(modifier = modifier.padding(innerPadding),
            innerPadding = innerPadding,
            foods = foods,
            offers = offers,
            recommendedFoods = recommendedFoods,
            foodMenu = foodMenu
        )
    }
}

fun getThemeColor(): Color{
    return Color(0xFFFF9800)
}

@Composable
fun ContentScreen(modifier: Modifier = Modifier,
                  innerPadding: PaddingValues,
                  foods: List<FoodItem>,
                  offers: List<OfferItem>,
                  recommendedFoods: List<RecommendedFoodItem>,
                  foodMenu: List<FoodMenuItem>
) {

    Column(modifier = Modifier
        .padding(innerPadding)
        .fillMaxSize()
    ) {

        Profile()
        SearchBar("What are you craving?")
        FoodSection(foods = foods, offers = offers, recommendedFoods, foodMenu)

    }

}

@Preview
@Composable
private fun BottomNavigationPreview(){
    FoodDeliveryTheme {
        val viewModel: HomeViewModel = hiltViewModel()

        MainScreen(viewModel = viewModel)
    }
}
