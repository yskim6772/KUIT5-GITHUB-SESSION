package com.example.kuit5_project_setting_solution.di

import com.example.kuit5_project_setting_solution.data.repositoryimpl.HomeRepositoryImpl
import com.example.kuit5_project_setting_solution.domain.repository.HomeRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindsHomeRepository(homeRepositoryImpl: HomeRepositoryImpl): HomeRepository
}