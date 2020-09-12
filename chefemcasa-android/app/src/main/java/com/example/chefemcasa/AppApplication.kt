package com.example.chefemcasa

import android.app.Application
import com.example.chefemcasa.beagle.BeagleSetup

class AppApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        BeagleSetup().init(this)
    }
}