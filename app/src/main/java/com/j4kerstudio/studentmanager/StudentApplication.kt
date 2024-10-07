package com.j4kerstudio.studentmanager

import android.app.Application
import com.j4kerstudio.studentmanager.data.AppContainer
import com.j4kerstudio.studentmanager.data.AppDataContainer

class StudentApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}