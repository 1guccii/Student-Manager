package com.j4kerstudio.studentmanager

import android.app.Application
import com.j4kerstudio.studentmanager.data.source.AppContainer
import com.j4kerstudio.studentmanager.data.source.AppDataContainer

class StudentApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}