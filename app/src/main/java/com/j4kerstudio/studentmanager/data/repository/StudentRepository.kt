package com.j4kerstudio.studentmanager.data.repository

import com.j4kerstudio.studentmanager.data.model.Student
import kotlinx.coroutines.flow.Flow

interface StudentRepository {

    fun getAllStudent(): Flow<List<Student>>

    fun getStudentStream(id: Int) : Flow<Student?>

    suspend fun insertStudent(student: Student)

    suspend fun deleteStudent(student: Student)

    suspend fun updateStudent(student: Student)
}