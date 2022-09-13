package uz.unidev.memorygame.domain.repositories

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import uz.unidev.memorygame.R
import uz.unidev.memorygame.data.models.GameModel
import uz.unidev.memorygame.data.source.local.enums.Level
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor() : AppRepository {

    private val data = ArrayList<GameModel>()

    init {
        load()
    }

    private fun load() {
        data.add(GameModel(1, R.drawable.ant))
        data.add(GameModel(2, R.drawable.bear))
        data.add(GameModel(3, R.drawable.bison))
        data.add(GameModel(4, R.drawable.buffalo))
        data.add(GameModel(5, R.drawable.cat5))
        data.add(GameModel(6, R.drawable.chicken))
        data.add(GameModel(7, R.drawable.cow))
        data.add(GameModel(8, R.drawable.crocodile))
        data.add(GameModel(9, R.drawable.dog5))
        data.add(GameModel(10, R.drawable.doraemon))
        data.add(GameModel(11, R.drawable.duck))
        data.add(GameModel(12, R.drawable.eagle))
        data.add(GameModel(13, R.drawable.elephant))
        data.add(GameModel(14, R.drawable.fox))
        data.add(GameModel(15, R.drawable.giraffe))
        data.add(GameModel(16, R.drawable.gorilla))
        data.add(GameModel(17, R.drawable.hedgehog))
        data.add(GameModel(18, R.drawable.hippo))
        data.add(GameModel(19, R.drawable.horse))
        data.add(GameModel(20, R.drawable.keroppi))
        data.add(GameModel(21, R.drawable.koala))
        data.add(GameModel(22, R.drawable.leopard))
        data.add(GameModel(23, R.drawable.lion))
        data.add(GameModel(24, R.drawable.monkey))
        data.add(GameModel(25, R.drawable.mouse))
    }

    override fun loadDataByLevel(level: Level): Flow<List<GameModel>> = flow {
        val count = level.x * level.y
        data.shuffle()
        emit(data.subList(0, count / 2))
    }
}