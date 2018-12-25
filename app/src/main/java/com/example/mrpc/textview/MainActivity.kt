package com.example.mrpc.textview

import android.graphics.ColorSpace
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etEmail.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                var charCounter: Int = etEmail.text.toString().length
                inputTextValidation(charCounter, etEmail, txtEmailCharCounter, this@MainActivity)
            }

        })
        etPassword.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                var charCounter: Int = etPassword.text.toString().length
                inputTextValidation(charCounter, etPassword, txtPasswordCharCounter, this@MainActivity)
            }

        })
        etEmail.setOnFocusChangeListener { view, b ->
            onIputTextViewFocusChange(b,  txtEmailCharCounter)
        }
        etPassword.setOnFocusChangeListener{view, b->
            onIputTextViewFocusChange(b, txtPasswordCharCounter)
        }
    }
}
