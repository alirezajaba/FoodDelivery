package com.parbaz.jbcompany.fooddelivery.presentation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.parbaz.jbcompany.fooddelivery.domain.model.FoodMenuItem

@Composable
fun FoodMenuGroup(foodMenuItems: List<FoodMenuItem>) {
    Column {
        foodMenuItems.chunked(4).forEach { rowItems ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 6.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                for (item in rowItems) {
                    FoodMenu(item = item)
                }
                // در صورت کمتر بودن از 4 آیتم، فضای خالی حفظ شود
                repeat(4 - rowItems.size) {
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}
