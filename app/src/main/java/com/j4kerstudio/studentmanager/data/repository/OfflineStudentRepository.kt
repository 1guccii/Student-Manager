package com.j4kerstudio.studentmanager.data.repository

import com.j4kerstudio.studentmanager.data.model.Student
import com.j4kerstudio.studentmanager.data.model.StudentDao
import kotlinx.coroutines.flow.Flow


class OfflineStudentRepository(private val studentDao: StudentDao) : StudentRepository {

    override fun getAllStudent(): Flow<List<Student>> = studentDao.getAllStudents()

    override fun getStudentStream(id: Int): Flow<Student?> = studentDao.getStudent(id)

    override suspend fun insertStudent(student: Student) = studentDao.insert(student)

    override suspend fun deleteStudent(student: Student) = studentDao.deleteStudent(student)

    override suspend fun updateStudent(student: Student) = studentDao.updateStudent(student)

}



