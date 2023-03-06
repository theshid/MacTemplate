package com.example.mactemplate.app.di

import android.content.Context
import androidx.room.Room
import com.example.mactemplate.data.local.db.LocalDao
import com.example.mactemplate.data.local.db.LocalDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun providesDatabase(
        @ApplicationContext context: Context,
    ): LocalDb = Room.databaseBuilder(context, LocalDb::class.java, LocalDb.DATABASE_NAME).build()

    @Provides
    @Singleton
    fun provideSurahDao(db: LocalDb): LocalDao = db.localDao()
}