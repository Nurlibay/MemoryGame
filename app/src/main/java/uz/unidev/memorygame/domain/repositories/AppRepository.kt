package uz.unidev.memorygame.domain.repositories

import kotlinx.coroutines.flow.Flow
import uz.unidev.memorygame.data.models.GameModel
import uz.unidev.memorygame.data.source.local.enums.Level

interface AppRepository {
    fun loadDataByLevel(level: Level): Flow<List<GameModel>>
}