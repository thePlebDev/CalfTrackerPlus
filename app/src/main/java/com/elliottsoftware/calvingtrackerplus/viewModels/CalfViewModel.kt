package com.elliottsoftware.calvingtrackerplus.viewModels

import android.app.Application
import androidx.lifecycle.*
import com.elliottsoftware.calvingtrackerplus.database.CalfDAO
import com.elliottsoftware.calvingtrackerplus.database.CalfDatabase
import com.elliottsoftware.calvingtrackerplus.models.Calf
import com.elliottsoftware.calvingtrackerplus.repositories.CalfRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CalfViewModel(application: Application): ViewModel() {

    private val allCalves: LiveData<List<Calf>>
    private val repository: CalfRepository


   init {
       val calfDAO = CalfDatabase.getDatabase(application).calfDao()
       repository = CalfRepository(calfDAO)
       allCalves = repository.allCalves
   }

    fun addCalf(calf: Calf){
        viewModelScope.launch(Dispatchers.IO){
            repository.insert(calf)
        }
    }

}
