package com.j4kerstudio.studentmanager

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.j4kerstudio.studentmanager.data.model.Student
import com.j4kerstudio.studentmanager.data.model.StudentDao
import com.j4kerstudio.studentmanager.data.model.StudentDatabase
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException
import kotlin.jvm.Throws


@RunWith(AndroidJUnit4::class)
class studentDaoTest {

    private lateinit var studentDatabase: StudentDatabase
    private lateinit var studentDao: StudentDao

    private val st1 = Student("23010346","123",9.8,8.2,8.5)
    private val st2 = Student("23010345","123",7.5,8.2,8.1)

    @Before
    fun createDB() {
        val context: Context = ApplicationProvider.getApplicationContext()

        studentDatabase = Room.inMemoryDatabaseBuilder(context,StudentDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        studentDao = studentDatabase.studentDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDB() {
        studentDatabase.close()
    }

    private suspend fun addStudentIntoDB() {
        studentDao.insert(st1)
        studentDao.insert(st2)
    }

    @Test
    @Throws(Exception::class)
    fun test() = runBlocking {
        addStudentIntoDB()
        val student = studentDao.getStudent(23010346)
        assertEquals(student,st1)
    }

}