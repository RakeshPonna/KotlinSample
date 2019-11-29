package com.example.kotlinapp.listview

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.kotlinapp.R
import com.example.kotlinapp.databinding.CustomListBinding

class MyListAdapter(
    private val context: Activity,
    private val title: Array<String>,
    private val description: Array<String>
) : ArrayAdapter<String>(
    context,
    R.layout.custom_list
) {


    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflator = context.layoutInflater
        val rowBinding = DataBindingUtil.inflate<CustomListBinding>(
            inflator,
            R.layout.custom_list,
            parent,
            false
        )

        rowBinding.title.text = title[position]
        rowBinding.description.text = description[position]
        return rowBinding.root

    }


    override fun getCount(): Int {
        return title.size
    }

}