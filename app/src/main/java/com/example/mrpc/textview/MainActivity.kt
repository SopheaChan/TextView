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

        inputTextValidation(etEmail, txtEmailCharCounter, this@MainActivity)
        inputTextValidation(etPassword, txtPasswordCharCounter, this@MainActivity)
        etEmail.setOnFocusChangeListener { view, b ->
            onIputTextViewFocusChange(b,  txtEmailCharCounter)
        }
        etPassword.setOnFocusChangeListener{view, b->
            onIputTextViewFocusChange(b, txtPasswordCharCounter)
        }
    }
}
