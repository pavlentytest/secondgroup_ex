package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var tv: TextView
    private lateinit var edit: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tv = findViewById(R.id.textView)
        edit = findViewById(R.id.editTextText)
        edit.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
              //  TODO("Not yet implemented")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
              //  TODO("Not yet implemented")
            }

            override fun afterTextChanged(p0: Editable?) {
                if((p0?.length ?: 0) > 0) {
                    val res = p0.toString().toDouble() * 100
                    tv.text = res.toString()
                } else {
                    tv.text = ""
                }
            }

        })
    }
}