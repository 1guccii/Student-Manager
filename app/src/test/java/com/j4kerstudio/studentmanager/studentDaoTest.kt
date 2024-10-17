package com.j4kerstudio.studentmanager

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
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
}