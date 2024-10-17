package com.j4kerstudio.studentmanager.data.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface StudentDao {

    @Query("SELECT * FROM Student ORDER BY idStudent ASC")
    fun getAllStudents(): Flow<List<Student>>

    @Query("SELECT * FROM Student WHERE idStudent = :id")
    fun getStudent(id: Int): Flow<Student?>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(student: Student)

    @Update
    suspend fun updateStudent(student: Student)

    @Delete
    suspend fun deleteStudent(student: Student)
}
