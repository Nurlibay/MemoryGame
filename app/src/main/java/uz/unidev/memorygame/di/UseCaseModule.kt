package uz.unidev.memorygame.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uz.unidev.memorygame.domain.usecases.GameUseCase
import uz.unidev.memorygame.domain.usecases.GameUseCaseImpl

@Module
@InstallIn(ViewModelComponent::class)
interface UseCaseModule {
    @Binds
    fun bindGameUseCase(impl: GameUseCaseImpl): GameUseCase
}