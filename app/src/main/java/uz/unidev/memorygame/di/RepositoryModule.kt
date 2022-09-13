package uz.unidev.memorygame.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.unidev.memorygame.domain.repositories.AppRepository
import uz.unidev.memorygame.domain.repositories.AppRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    @Singleton
    fun bindAppRepository(impl: AppRepositoryImpl): AppRepository

}