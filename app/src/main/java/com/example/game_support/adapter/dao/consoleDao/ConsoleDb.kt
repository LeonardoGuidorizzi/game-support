package com.example.game_support.adapter.dao.consoleDao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.io.Console

@Database(entities = [Console::class], version = 1)
abstract class ConsoleDb: RoomDatabase() {

    abstract fun contactDao(): ConsoleDao

    companion object {
        private lateinit var instance: ConsoleDb

        fun getDatabase(context: Context): ConsoleDb {
            if (!::instance.isInitialized) {
                instance = Room.databaseBuilder(
                    context,
                    ConsoleDb::class.java,
                    "db_contact_book"
                ).allowMainThreadQueries().build()
            }
            return instance
        }
    }
}