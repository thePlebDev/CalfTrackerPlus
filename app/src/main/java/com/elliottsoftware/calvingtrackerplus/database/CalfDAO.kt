package com.elliottsoftware.calvingtrackerplus.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.elliottsoftware.calvingtrackerplus.models.Calf
import kotlinx.coroutines.flow.Flow


@Dao
interface CalfDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(calf: Calf)

    @Update
    suspend fun update(calf: Calf)

    @Delete
    suspend fun delete(calf: Calf)

    @Query("SELECT * FROM calf ORDER BY id ASC")
    fun getCalves(): LiveData<List<Calf>>

    @Query("DELETE FROM calf ")
    fun deleteAllCalf()
}