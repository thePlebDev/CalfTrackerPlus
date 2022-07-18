package com.elliottsoftware.calvingtrackerplus.database

import android.app.Application

class CalfApplication : Application() {
    val database: CalfDatabase by lazy { CalfDatabase.getDatabase(this) }
}