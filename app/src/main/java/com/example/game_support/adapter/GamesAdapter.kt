package com.example.game_support.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.game_support.R
import com.example.game_support.model.game

class GamesAdapter(val context: Context): RecyclerView.Adapter<GamesAdapter.HolderGames>() {

    private var gamesList = listOf<game>()

    fun updateGamesList(games: List<game>) {
        this.gamesList = games
        notifyDataSetChanged()
    }

    class HolderGames(val view: View): RecyclerView.ViewHolder(view) {

        val companyNameHolder = view.findViewById<TextView>(R.id.company_name)
        val gameNameHolder = view.findViewById<TextView>(R.id.text_game_name)
        val descriptiomHolder = view.findViewById<TextView>(R.id.text_description)
        val photoHolder = view.findViewById<ImageView>(R.id.image_view_game_photo)

        fun bind(games: game) {

            companyNameHolder.text = games.Estudio
            gameNameHolder.text = games.titulo
            descriptiomHolder.text = games.descricao
            photoHolder.setImageDrawable(null)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderGames {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_game, parent, false)
        return HolderGames(view)
    }

    override fun onBindViewHolder(holder: HolderGames, position: Int) {
        holder.bind(gamesList.get(position))
    }

    override fun getItemCount(): Int {
        return gamesList.size
    }

}