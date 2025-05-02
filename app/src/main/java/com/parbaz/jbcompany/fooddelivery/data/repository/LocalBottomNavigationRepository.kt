package com.parbaz.jbcompany.fooddelivery.data.repository

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import com.parbaz.jbcompany.fooddelivery.domain.model.BottomNavItem
import com.parbaz.jbcompany.fooddelivery.domain.repository.BottomNavigationRepository

class LocalBottomNavigationRepository: BottomNavigationRepository {

    override suspend fun getBottomNavigationItems(): List<BottomNavItem> {
        return listOf(
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

    }

}