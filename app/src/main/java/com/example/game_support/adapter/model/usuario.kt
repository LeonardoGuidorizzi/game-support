package com.example.game_support.adapter.model

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Console
import java.time.LocalDate


@Entity (tableName = "tbl_usuario")
class usuario {

    @PrimaryKey(autoGenerate = true)
    var id = 0

    var foto:Bitmap? = null
    var email = ""
    var senha = ""
    var nome = ""
    var cidade = ""
    var sexo = 'I'
    var nivel = NiveisEnum.INICIAL
    var console: Console? = null

    @ColumnInfo( name = "data_nascimeto" )

    var dataNascimeto:LocalDate? = null



}