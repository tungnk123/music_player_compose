package com.tungnk123.musicplayercompose.domain.repository

import com.tungnk123.musicplayercompose.domain.model.Song
import com.tungnk123.musicplayercompose.utils.Resource
import kotlinx.coroutines.flow.Flow

interface MusicRepository {
    fun getSongs(): Flow<Resource<List<Song>>>
}