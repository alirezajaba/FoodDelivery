package com.parbaz.jbcompany.fooddelivery.di


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
    fun provideOfferRepository(): OfferRepository = FakeOfferRepository()

    @Provides
    @Singleton
    fun provideRecommendedFoodRepository(): RecommendedFoodRepository = FakeRecommendedFoodRepository()

    @Provides
    @Singleton
    fun provideBottomNavigationRepository(): BottomNavigationRepository = FakeBottomNavigationRepository()

    @Provides
    @Singleton
    fun provideFoodMenuRepository(): FoodMenuRepository = FakeFoodMenuRepository()

    @Provides
    @Singleton
    fun provideFoodRepository(): FoodRepository = FakeFoodRepository()
}
