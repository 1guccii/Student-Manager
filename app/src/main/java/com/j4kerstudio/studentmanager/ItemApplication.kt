package com.j4kerstudio.studentmanager

import android.app.Application
import com.j4kerstudio.studentmanager.data.model.AppContainer
import com.j4kerstudio.studentmanager.data.model.AppDataContainer

class ItemApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}