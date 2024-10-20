package com.j4kerstudio.studentmanager.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entity data class represents a single row in the database.
 */
@Entity(tableName = "student")
data class Student(
    @PrimaryKey
    val idStudent: Int = 0,
    val nameStudent: String,
    val idClass: Double,
    )