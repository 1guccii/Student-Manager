package com.j4kerstudio.studentmanager.data.model

import kotlinx.coroutines.flow.Flow

interface StudentRepository {

    fun getStudentStream() : Flow<List<Student>>

    fun getEnglishGrade() : Flow<List>
}