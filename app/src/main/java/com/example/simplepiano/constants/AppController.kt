package com.example.simplepiano.constants

import android.app.Application
import android.content.Context
import com.example.simplepiano.utils.SoundPoolUtils

class AppController : Application() {

    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = this
        SoundPoolUtils.init()
    }

}