package com.parbaz.jbcompany.fooddelivery.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.parbaz.jbcompany.fooddelivery.domain.model.BottomNavItem
import com.parbaz.jbcompany.fooddelivery.domain.model.FoodItem
import com.parbaz.jbcompany.fooddelivery.domain.model.FoodMenuItem
import com.parbaz.jbcompany.fooddelivery.domain.model.OfferItem
import com.parbaz.jbcompany.fooddelivery.domain.model.RecommendedFoodItem
import com.parbaz.jbcompany.fooddelivery.domain.repository.BottomNavigationRepository
import com.parbaz.jbcompany.fooddelivery.domain.repository.FoodMenuRepository
import com.parbaz.jbcompany.fooddelivery.domain.repository.FoodRepository
import com.parbaz.jbcompany.fooddelivery.domain.repository.OfferRepository
import com.parbaz.jbcompany.fooddelivery.domain.repository.RecommendedFoodRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val foodRepository: FoodRepository,
    private val offerRepository: OfferRepository,
    private val recommendedFoodRepository: RecommendedFoodRepository,
    private val bottomNavigationRepository: BottomNavigationRepository,
    private val foodMenuRepository: FoodMenuRepository
) : ViewModel() {

    private val _offers = MutableStateFlow<List<OfferItem>>(emptyList())
    val offers: StateFlow<List<OfferItem>> = _offers

    private val _foods = MutableStateFlow<List<FoodItem>>(emptyList())
    val foods: StateFlow<List<FoodItem>> = _foods

    private val _recommendedFoods = MutableStateFlow<List<RecommendedFoodItem>>(emptyList())
    val recommendedFoods: StateFlow<List<RecommendedFoodItem>> = _recommendedFoods

    private val _navigation = MutableStateFlow<List<BottomNavItem>>(emptyList())
    val navigation: StateFlow<List<BottomNavItem>> = _navigation

    private val _foodMenu = MutableStateFlow<List<FoodMenuItem>>(emptyList())
    val foodMenu: StateFlow<List<FoodMenuItem>> = _foodMenu


    init {
        loadOffers()
        loadFoods()
        loadRecommendedFoods()
        loadNavigation()
        loadFoodMenu()
    }


    private fun loadOffers() {
        viewModelScope.launch {
            _offers.value = offerRepository.getOfferItems()
        }
    }

    private fun loadFoods() {
        viewModelScope.launch {
            _foods.value = foodRepository.getFoodItems()
        }
    }

    private fun loadRecommendedFoods() {
        viewModelScope.launch {
            _recommendedFoods.value = recommendedFoodRepository.getRecommendedFoodItems()
        }
    }

    private fun loadNavigation() {
        viewModelScope.launch {
            _navigation.value = bottomNavigationRepository.getBottomNavigationItems()
        }
    }

    private fun loadFoodMenu() {
        viewModelScope.launch {
            _foodMenu.value = foodMenuRepository.getFoodMenuItems()
        }
    }

}
