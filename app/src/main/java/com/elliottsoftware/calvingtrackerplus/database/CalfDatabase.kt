package com.elliottsoftware.calvingtrackerplus.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.elliottsoftware.calvingtrackerplus.models.Calf
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import java.util.*

@Database(entities = [Calf::class],version = 1, exportSchema = false)
abstract class CalfDatabase: RoomDatabase() {

    abstract fun calfDao(): CalfDAO

    companion object{
        @Volatile
        private var INSTANCE: CalfDatabase? = null;

        fun getDatabase(context: Context): CalfDatabase{
            val instance = INSTANCE
            if(instance != null){
                return instance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CalfDatabase::class.java,
                    "calf_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }




}
