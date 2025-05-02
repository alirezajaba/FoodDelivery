package com.parbaz.jbcompany.fooddelivery.presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.parbaz.jbcompany.fooddelivery.R
import com.parbaz.jbcompany.fooddelivery.presentation.ui.screens.home.getThemeColor

@Composable
fun Profile() {

    Box(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.align(Alignment.TopStart)
        ) {
            Card(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp),
                shape = RoundedCornerShape(40.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_profile_pic),
                    contentDescription = "title",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(modifier = Modifier.align(Alignment.Start),
                    text = "Deliver to",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
                Row(
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Text(modifier = Modifier.align(Alignment.CenterVertically),
                        text = "Times Square",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Dropdown",
                        tint = getThemeColor(),
                        modifier = Modifier.size(40.dp)
                    )
                }
            }
        }

        Row(
            modifier = Modifier.align(Alignment.TopEnd)

        ) {
            Card(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp),
                shape = RoundedCornerShape(40.dp)
            ) {
                Card(
                    modifier = Modifier
                        .padding(1.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    shape = RoundedCornerShape(40.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_notify),
                        contentDescription = "title",
                        modifier = Modifier
                            .padding(18.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                }
            }

            Spacer(modifier = Modifier.width(10.dp))

            Card(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp),
                shape = RoundedCornerShape(40.dp)
            ) {
                Card(
                    modifier = Modifier
                        .padding(1.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    shape = RoundedCornerShape(40.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.shopping_bag_6810935),
                        contentDescription = "title",
                        modifier = Modifier
                            .padding(18.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                }
            }
        }


    }

}
