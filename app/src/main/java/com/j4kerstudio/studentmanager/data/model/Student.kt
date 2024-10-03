package com.j4kerstudio.studentmanager.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Student")
data class Student (
    @PrimaryKey(autoGenerate = true)
    val idStudent: String,
    val idClass : String,
    val mathematicsGrade : Double,
    val physicGrade : Double,
    val chemistryGrade : Double
)
