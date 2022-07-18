package com.elliottsoftware.calvingtrackerplus.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Calf(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val tagNumber: String,
    val CCIANumber: String,
    val sex:String,
    val details:String,
    val date:Date,
    val weight:Int
) {

}