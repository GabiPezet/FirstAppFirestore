package com.example.firstappfirestore.data

import com.example.firstappfirestore.data.model.AnalyticModel
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.logEvent
import javax.inject.Inject

class AnalyticsManager @Inject constructor(private val firebaseAnalytics: FirebaseAnalytics){

    fun example(){
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.APP_OPEN){
            param(FirebaseAnalytics.Param.SCORE, "242")
        }
    }

    fun exampleCustom(){
        firebaseAnalytics.logEvent("GabrielPezetTesting"){
            param("Linea", "242")
            param("LineaLong", 390)
        }
    }

    fun sendEvent(analyticsModel: AnalyticModel){
        firebaseAnalytics.logEvent(analyticsModel.title){
            analyticsModel.analyticsString.map {param(it.first, it.second)}
            analyticsModel.analyticsLong.map {param(it.first, it.second)}
            analyticsModel.analyticsDouble.map {param(it.first, it.second)}
            analyticsModel.analyticsBundle.map {param(it.first, it.second)}
            analyticsModel.analyticsBundleArray.map {param(it.first, it.second.toTypedArray())}
        }
    }
}