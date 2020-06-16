package com.example.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.time.minutes

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour,  minute ->
                textView.text = hour.toString()

                if (hour >= 18) {
                    textView.text ="こんばんは"
                } else if (hour >= 10) {
                    textView.text ="こんにちは"
                } else  if (hour >= 2) {
                    textView.text ="おはよう"
                } else {
                    textView.text ="こんばんは"
                }

            },
            13, 0, true)
        timePickerDialog.show()



    }
}
