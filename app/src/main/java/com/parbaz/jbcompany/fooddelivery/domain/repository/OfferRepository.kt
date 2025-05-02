package com.parbaz.jbcompany.fooddelivery.domain.repository

import com.parbaz.jbcompany.fooddelivery.domain.model.OfferItem

interface OfferRepository {

    suspend fun getOfferItems(): List<OfferItem>

}