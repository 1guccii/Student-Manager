package com.j4kerstudio.studentmanager.data.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Student::class], version = 1, exportSchema = false)
abstract class StudentDatabase : RoomDatabase() {
    abstract fun studentDao(): StudentDao

    companion object {
        @Volatile
        private var instance: StudentDatabase? = null

        fun getDatabase(context: Context): StudentDatabase {
            return instance ?: synchronized(this) {
                Room.databaseBuilder(context.applicationContext, StudentDatabase::class.java, "student_database")
                    .build()
                    .also { instance = it }
            }
        }
    }
}
