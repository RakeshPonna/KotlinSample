package com.example.kotlinapp.bottomSheet

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kotlinapp.R
import com.example.kotlinapp.databinding.ActivityBottomsheetBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_bottomsheet.*
import kotlinx.android.synthetic.main.bottom_sheet.*
import java.util.logging.Logger

class BottomSheetActivity : AppCompatActivity() {

    var sheetBehavior: BottomSheetBehavior<*>? = null

    companion object {
        val log = Logger.getLogger(BottomSheetActivity::class.java.name)

    }

    lateinit var binding: ActivityBottomsheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_bottomsheet)
        setSupportActionBar(toolbar)
        toolbar.setTitle("Bottom Sheet")
        toolbar.setTitleTextColor(Color.WHITE)

        sheetBehavior = BottomSheetBehavior.from(binding.bottomSheet.bottomSheetLayout)
        sheetBehavior?.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(p0: View, p1: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                log.info("On Slide")
            }

            override fun onSlide(p0: View, p1: Float) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                log.info("On State changes")
            }
        })


        tab_layout.addTab(tab_layout.newTab())
        tab_layout.addTab(tab_layout.newTab())
        tab_layout.addTab(tab_layout.newTab())
        val adapter = ViewPagerAdapter(supportFragmentManager)
        view_pager.adapter = adapter
        view_pager.addOnPageChangeListener(
            TabLayout
                .TabLayoutOnPageChangeListener(tab_layout)
        )

    }

}