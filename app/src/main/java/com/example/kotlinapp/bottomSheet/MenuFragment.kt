package com.example.kotlinapp.bottomSheet

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.kotlinapp.R
import com.example.kotlinapp.databinding.FragmentMenuBinding
import kotlinx.android.synthetic.main.fragment_menu.*

class MenuFragment : Fragment() {

    lateinit var pos: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var bundle = arguments
        var string = bundle?.getString("key")

        when (string) {
            "0" -> {
                pos = "-0"
            }
            "1" -> {
                pos = "1"
            }
            "2" -> {
                pos = "2"
            }

        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v = inflater.inflate(R.layout.fragment_menu, container, false)

//        var binding = DataBindingUtil.inflate<FragmentMenuBinding>(
//            activity?.layoutInflater, R.layout.fragment_menu, container, false
//        )

        when (pos) {

            "0" -> {
                val imageList = listOf(
                    R.drawable.ic_launcher,
                    R.drawable.ic_launcher,
                    R.drawable.ic_launcher,
                    R.drawable.ic_launcher
                )
                val menuAdapter = activity?.let { MenuAdapter(it, imageList) }
                val grid = GridLayoutManager(activity, 2)
                recycler_view?.layoutManager = grid
                recycler_view?.adapter = menuAdapter
            }
            "1" -> {
                val imageList = listOf(
                    R.drawable.ic_launcher,
                    R.drawable.ic_launcher,
                    R.drawable.ic_launcher,
                    R.drawable.ic_launcher
                )
                val menuAdapter = activity?.let { MenuAdapter(it, imageList) }
                val grid = GridLayoutManager(activity, 2)
                recycler_view?.layoutManager = grid
                recycler_view?.adapter = menuAdapter
            }
            "2" -> {
                val imageList = listOf(
                    R.drawable.ic_launcher,
                    R.drawable.ic_launcher,
                    R.drawable.ic_launcher,
                    R.drawable.ic_launcher
                )
//                val menuAdapter = MenuAdapter(activity!!.applicationContext as Activity, imageList)
                val menuAdapter = activity?.let { MenuAdapter(it, imageList) }
                val grid = GridLayoutManager(activity, 2)
                recycler_view?.layoutManager = grid
                recycler_view?.adapter = menuAdapter
            }
        }

        return v
    }


}