package com.example.game_support.model

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity


@Entity (tableName = "tbl_game")

class game {
    var id = 0
    var foto :Bitmap? = null
    var titulo = ""
    var descricao = ""
    var Estudio = ""

    @ColumnInfo(name="ano_lancamento")
    var anoLancamento = 0

    var  finalizado = true

}