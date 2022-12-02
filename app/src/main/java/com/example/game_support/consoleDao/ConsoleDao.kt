package com.example.game_support.consoleDao

import androidx.room.*
import com.example.game_support.model.console
import java.io.Console

@Dao

interface ConsoleDao {

    @Dao
    interface ContactDao {

        @Insert
        fun save(contact: Console): Long

        @Delete
        fun delete(contact: Console): Int

        @Update
        fun update(contact: Console): Int

        @Query("SELECT * FROM tbl_console ORDER BY nome ASC")
        fun getAll(): List<console>

        // :id -> parametro da funcao
        @Query("SELECT * FROM tbl_console WHERE id = :id")
        fun getContactById(id: Int): Console



    }
}