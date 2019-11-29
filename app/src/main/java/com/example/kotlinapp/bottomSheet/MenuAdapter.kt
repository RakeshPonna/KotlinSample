package com.example.kotlinapp.bottomSheet

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinapp.databinding.ListRecyclerViewBinding
import kotlinx.android.synthetic.main.list_recycler_view.view.*


class MenuAdapter(private val context: Activity, private val listImages: List<Int>) :
    RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {

        val listRecyclerViewBinding = DataBindingUtil.inflate<ListRecyclerViewBinding>(
            context.layoutInflater,
            com.example.kotlinapp.R.layout.list_recycler_view, parent, true
        )

        return MenuViewHolder(listRecyclerViewBinding.root)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return listImages.size
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bindItems(listImages[position])
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(image: Int) {
            itemView.image_card_view.setImageResource(image)
        }
    }
}