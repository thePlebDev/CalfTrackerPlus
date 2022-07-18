package com.elliottsoftware.calvingtrackerplus.repositories

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.elliottsoftware.calvingtrackerplus.database.CalfDAO
import com.elliottsoftware.calvingtrackerplus.models.Calf
import kotlinx.coroutines.flow.Flow

class CalfRepository(private val calfDAO: CalfDAO) {

    val allCalves: LiveData<List<Calf>> = calfDAO.getCalves();

    @WorkerThread
    suspend fun insert(calf:Calf){
        calfDAO.insert(calf)
    }
}