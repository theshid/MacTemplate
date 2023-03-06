package com.example.mactemplate.data.local.model

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class Model(
    @PrimaryKey(autoGenerate = false) @ColumnInfo(name = "number") val id: Int,
    @ColumnInfo(name = "name") val name: String,
)
