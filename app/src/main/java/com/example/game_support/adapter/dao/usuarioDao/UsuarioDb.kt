package com.example.game_support.adapter.dao.usuarioDao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.game_support.adapter.dao.consoleDao.ConsoleDao


@Database(entities = [UsuarioDb::class], version = 1)
abstract class UsuarioDb: RoomDatabase() {

    abstract fun UsuarioDao(): ConsoleDao

    companion object {
        private lateinit var instance: UsuarioDb

        fun getDatabase(context: Context): UsuarioDb {
            if (!::instance.isInitialized) {
                instance = Room.databaseBuilder(
                    context,
                    UsuarioDb::class.java,
                    "db_contact_book"
                ).allowMainThreadQueries().build()
            }
            return instance
        }
    }
}