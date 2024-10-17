package com.j4kerstudio.studentmanager.source

import android.app.Application
import com.j4kerstudio.studentmanager.data.model.AppContainer
import com.j4kerstudio.studentmanager.data.model.AppDataContainer

class InventoryApplication : Application() {

    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}