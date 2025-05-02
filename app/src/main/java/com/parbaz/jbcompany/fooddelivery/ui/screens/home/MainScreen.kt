package com.parbaz.jbcompany.fooddelivery.ui.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.parbaz.jbcompany.fooddelivery.ui.components.FoodSection
import com.parbaz.jbcompany.fooddelivery.ui.components.Profile
import com.parbaz.jbcompany.fooddelivery.ui.theme.FoodDeliveryTheme
import com.parbaz.jbcompany.fooddelivery.ui.components.SearchBar
import com.parbaz.jbcompany.fooddelivery.viewmodel.HomeViewModel


@Composable
fun MainScreen(modifier: Modifier,
    viewModel: HomeViewModel = viewModel()
) {
    val state by viewModel.foodItem.collectAsState()
    val uiState by viewModel.offerItem.collectAsState()
    val navItem by viewModel.navItems.collectAsState()
    val foodMenuItems by viewModel.foodMenuItems.collectAsState()
    val recommendedFoodItems by viewModel.recommendedFoodItems.collectAsState()
    var selectedIndex by remember { mutableIntStateOf(0) }

    val navItems = navItem.navItems

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
            state = state,
            uiState = uiState,
            recFoodItem = recommendedFoodItems,
            foodMenuItems = foodMenuItems
        )
    }
}

fun getThemeColor(): Color{
    return Color(0xFFFF9800)
}

@Composable
fun ContentScreen(modifier: Modifier = Modifier, innerPadding: PaddingValues, state: HomeUiState, uiState: HomeUiState, recFoodItem: HomeUiState, foodMenuItems: HomeUiState) {

    Column(modifier = Modifier
        .padding(innerPadding)
        .fillMaxSize()
    ) {

        Profile()
        SearchBar("What are you craving?")
        FoodSection(state = state, uiState = uiState, recFoodItem, foodMenuItems)

    }

}

@Preview
@Composable
private fun BottomNavigationPreview(){
    FoodDeliveryTheme {
        MainScreen(Modifier)
    }
}
