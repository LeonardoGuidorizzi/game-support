package com.example.game_support.model

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity (tableName = "tbl_console")

class console {
 @PrimaryKey
 var id = 0
  var nome = ""
  var descricao = ""
  var foto:Bitmap? = null

 @ColumnInfo(name="ano_lancamento")

  var anoLancamento = 0
}