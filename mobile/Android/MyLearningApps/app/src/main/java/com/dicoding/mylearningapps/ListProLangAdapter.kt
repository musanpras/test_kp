package com.dicoding.mylearningapps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListProLangAdapter (val listProLang: ArrayList<ProLang>) : RecyclerView.Adapter<ListProLangAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvLevel: TextView = itemView.findViewById(R.id.tv_item_level)
        var imgImages: ImageView = itemView.findViewById(R.id.img_item_image)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: ProLang)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_prolang, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val prolang = listProLang[position]

        Glide.with(holder.itemView.context)
            .load(prolang.image)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgImages)

        holder.tvName.text = prolang.name
        holder.tvLevel.text = prolang.level
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listProLang[holder.adapterPosition]) }

    }

    override fun getItemCount(): Int {
        return listProLang.size
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }


}