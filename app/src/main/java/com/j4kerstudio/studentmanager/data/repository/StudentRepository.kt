package com.j4kerstudio.studentmanager.data.repository

import com.j4kerstudio.studentmanager.data.model.Student
import kotlinx.coroutines.flow.Flow

interface StudentRepository {
    fun getAllStudentStream(): Flow<List<Student>>

    /**
     * Retrieve an item from the given data source that matches with the [id].
     */
    fun getStudentStream(id: Int): Flow<Student?>

    /**
     * Insert item in the data source
     */
    suspend fun insertStudent(student: Student)

    /**
     * Delete item from the data source
     */
    suspend fun deleteStudent(student: Student)

    /**
     * Update item in the data source
     */
    suspend fun updateStudent(student: Student)
}