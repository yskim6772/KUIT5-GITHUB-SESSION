package com.example.kuit5_project_setting_solution

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class KuitApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}