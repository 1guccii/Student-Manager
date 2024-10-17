package com.j4kerstudio.studentmanager.data.source

import android.content.Context
import com.j4kerstudio.studentmanager.data.repository.OfflineStudentRepository
import com.j4kerstudio.studentmanager.data.repository.StudentRepository

interface AppContainer {
    val studentRepository: StudentRepository
}

/**
 * [AppContainer] implementation that provides instance of [OfflineItemsRepository]
 */
class AppDataContainer(private val context: Context) : AppContainer {
    /**
     */
    override val studentRepository: StudentRepository by lazy {
        OfflineStudentRepository(StudentDatabase.getDatabase(context).studentDao())
    }
}