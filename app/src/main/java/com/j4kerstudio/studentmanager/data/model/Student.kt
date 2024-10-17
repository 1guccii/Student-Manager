package com.j4kerstudio.studentmanager.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Student")
data class Student(
    @PrimaryKey(autoGenerate = true) val idStudent: Int = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "id_class") val idClass: String,
    @ColumnInfo(name = "mathematics_grade") val mathematicsGrade: Double,
    @ColumnInfo(name = "physic_grade") val physicGrade: Double,
    @ColumnInfo(name = "chemistry_grade") val chemistryGrade: Double
)
