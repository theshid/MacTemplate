package com.example.mactemplate.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mactemplate.data.local.model.Model

@Database(
    entities = [Model::class], version = 1, exportSchema = true
)
abstract class LocalDb:RoomDatabase() {
    abstract fun localDao(): LocalDao

    companion object {
        const val DATABASE_NAME: String = "local_database"
    }
}