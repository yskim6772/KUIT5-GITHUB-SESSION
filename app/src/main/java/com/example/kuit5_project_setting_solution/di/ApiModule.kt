package com.example.kuit5_project_setting_solution.di

import com.example.kuit5_project_setting_solution.data.service.HomeService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
    @Provides
    @Singleton
    fun providesHomeService(retrofit: Retrofit): HomeService =
        retrofit.create(HomeService::class.java)
}