package com.example.firstappfirestore.ui

import androidx.lifecycle.ViewModel
import com.example.firstappfirestore.data.AnalyticsManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val analyticsManager: AnalyticsManager): ViewModel() {
    
    fun onLoginSelected(){
        // TODO: realiza la lógica
        analyticsManager.example()
        analyticsManager.exampleCustom()
    }
}