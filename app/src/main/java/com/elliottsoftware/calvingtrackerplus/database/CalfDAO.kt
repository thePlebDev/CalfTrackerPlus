package com.elliottsoftware.calvingtrackerplus.database

import androidx.room.*
import com.elliottsoftware.calvingtrackerplus.models.Calf
import kotlinx.coroutines.flow.Flow


@Dao
interface CalfDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(calf: Calf)

    @Update
    suspend fun update(calf: Calf)

    @Delete
    suspend fun delete(calf: Calf)

    @Query("SELECT * FROM calf ORDER BY tagNumber ASC")
    fun getCalves(): Flow<List<Calf>>
}