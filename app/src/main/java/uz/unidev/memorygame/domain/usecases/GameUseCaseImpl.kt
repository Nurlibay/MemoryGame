package uz.unidev.memorygame.domain.usecases

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import uz.unidev.memorygame.data.models.GameModel
import uz.unidev.memorygame.data.source.local.enums.Level
import uz.unidev.memorygame.domain.repositories.AppRepository
import javax.inject.Inject

class GameUseCaseImpl @Inject constructor(
    private val appRepository: AppRepository
) : GameUseCase {
    override fun getDataByLevel(level: Level): Flow<List<GameModel>> = flow {

        val result = ArrayList<GameModel>()
        val list = appRepository.loadDataByLevel(level)

        list.collect {
            result.addAll(it)
            result.addAll(it)
        }

        result.shuffle()
        emit(result)
    }.flowOn(Dispatchers.Default)
}