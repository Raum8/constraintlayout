package com.example.android.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val checkableViews: List<View> =
            listOf(
                box_one_text,
                box_two_text,
                box_three_text,
                box_four_text,
                box_five_text,
                constraint_layout,
                red_button,
                yellow_button,
                green_button
            )

        for (element in checkableViews)
            element.setOnClickListener { makeColored(it) }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Using Color class
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Using android resources
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_blue_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_blue_light)

            // Using my colors
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.myRed)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.myYellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.myGreen)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}