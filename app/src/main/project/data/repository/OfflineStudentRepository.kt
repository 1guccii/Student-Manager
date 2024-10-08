package com.j4kerstudio.studentmanager.data.model

import com.j4kerstudio.studentmanager.data.repository.StudentRepository


abstract class OfflineStudentRepository(private val studentDao: StudentDao) : StudentRepository {

}



