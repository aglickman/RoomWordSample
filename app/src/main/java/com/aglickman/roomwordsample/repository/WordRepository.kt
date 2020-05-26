package com.aglickman.roomwordsample.repository

import androidx.lifecycle.LiveData
import com.aglickman.roomwordsample.datastore.Word
import com.aglickman.roomwordsample.datastore.WordDao

class WordRepository(private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()

    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }

}