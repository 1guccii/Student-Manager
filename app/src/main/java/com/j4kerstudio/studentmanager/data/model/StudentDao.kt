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

    @Query("SELECT * from student ORDER BY idStudent ASC")
    fun getAllItems(): Flow<List<Student>>

    @Query("SELECT * from student WHERE idStudent = :id")
    fun getItem(id: Int): Flow<Student>

    // Specify the conflict strategy as IGNORE, when the user tries to add an
    // existing Item into the database Room ignores the conflict.
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Student)

    @Update
    suspend fun update(item: Student)

    @Delete
    suspend fun delete(item: Student)
}