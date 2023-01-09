package com.ft.checkedtext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckedTextView
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i=1
        findViewById<Button>(R.id.button).setOnClickListener {
            var imie=findViewById<EditText>(R.id.editTextTextPersonName).text.toString()

            when(i){
                1 -> findViewById<CheckedTextView>(R.id.simpleCheckedTextView).text=imie
                2 -> findViewById<CheckedTextView>(R.id.simpleCheckedTextView2).text=imie
                3 -> findViewById<CheckedTextView>(R.id.simpleCheckedTextView3).text=imie
                4 -> findViewById<CheckedTextView>(R.id.simpleCheckedTextView4).text=imie
                5 -> findViewById<CheckedTextView>(R.id.simpleCheckedTextView5).text=imie
                6 -> findViewById<CheckedTextView>(R.id.simpleCheckedTextView6).text=imie
                7 -> findViewById<CheckedTextView>(R.id.simpleCheckedTextView7).text=imie
                8 -> findViewById<CheckedTextView>(R.id.simpleCheckedTextView8).text=imie
            }
            i=i+1
        }
    }
}