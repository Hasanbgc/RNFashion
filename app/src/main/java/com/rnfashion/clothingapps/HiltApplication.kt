package com.rnfashion.clothingapps

import androidx.multidex.MultiDexApplication
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HiltApplication : MultiDexApplication(){
    override fun onCreate() {
        super.onCreate()

    }

}