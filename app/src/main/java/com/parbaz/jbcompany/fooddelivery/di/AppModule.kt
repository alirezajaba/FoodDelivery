package com.parbaz.jbcompany.fooddelivery.di


import com.parbaz.jbcompany.fooddelivery.data.repository.LocalBottomNavigationRepository
import com.parbaz.jbcompany.fooddelivery.data.repository.LocalFoodMenuRepository
import com.parbaz.jbcompany.fooddelivery.data.repository.LocalFoodRepository
import com.parbaz.jbcompany.fooddelivery.data.repository.LocalOfferRepository
import com.parbaz.jbcompany.fooddelivery.data.repository.LocalRecommendedFoodRepository
import com.parbaz.jbcompany.fooddelivery.domain.repository.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideOfferRepository(): OfferRepository = LocalOfferRepository()

    @Provides
    @Singleton
    fun provideRecommendedFoodRepository(): RecommendedFoodRepository = LocalRecommendedFoodRepository()

    @Provides
    @Singleton
    fun provideBottomNavigationRepository(): BottomNavigationRepository = LocalBottomNavigationRepository()

    @Provides
    @Singleton
    fun provideFoodMenuRepository(): FoodMenuRepository = LocalFoodMenuRepository()

    @Provides
    @Singleton
    fun provideFoodRepository(): FoodRepository = LocalFoodRepository()
}
