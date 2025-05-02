package com.parbaz.jbcompany.fooddelivery.domain.repository

import com.parbaz.jbcompany.fooddelivery.domain.model.BottomNavItem

interface BottomNavigationRepository {

    suspend fun getBottomNavigationItems(): List<BottomNavItem>

}