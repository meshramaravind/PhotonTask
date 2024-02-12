package com.arvind.photontask.di

import com.arvind.photontask.data.repository.Repository
import com.arvind.photontask.domain.usecase.GetSchoolDetailsUseCase
import com.arvind.photontask.domain.usecase.UseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun providesUseCases(repository: Repository): UseCases {
        return UseCases(
            getSchoolDetailsUseCase = GetSchoolDetailsUseCase(repository),
        )
    }
}