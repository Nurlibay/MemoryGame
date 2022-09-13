package uz.unidev.memorygame.domain.usecases

import kotlinx.coroutines.flow.Flow
import uz.unidev.memorygame.data.models.GameModel
import uz.unidev.memorygame.data.source.local.enums.Level

interface GameUseCase {
    fun getDataByLevel(level: Level): Flow<List<GameModel>>
}