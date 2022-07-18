package com.elliottsoftware.calvingtrackerplus.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.elliottsoftware.calvingtrackerplus.models.Calf

@Database(entities = [Calf::class],version = 1, exportSchema = false)
abstract class CalfDatabase: RoomDatabase() {

    //let the database know about the DAO
    abstract fun calfDao():CalfDAO

    companion object{
        //singleton prevents multiple instances of database opening at the same time
        @Volatile //HOLDS THE INSTANCE OF THE DATABASE
        private var INSTANCE: CalfDatabase? = null
        fun getDatabase(context: Context): CalfDatabase {
            //if the INSTANCE is not null, return it,
            //if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CalfDatabase::class.java,
                    "calf_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }




}