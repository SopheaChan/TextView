package com.example.mrpc.textview

import android.content.Context
import android.support.v4.content.ContextCompat.getColor
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

fun inputTextValidation(editText: EditText, textView: TextView, context: Context){
    editText.addTextChangedListener(object: TextWatcher{
        override fun afterTextChanged(p0: Editable?) {

        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            val charCounter: Int = editText.text.toString().length
            if (charCounter<=50){
                textView.setTextColor(getColor(context, R.color.colorPrimary))
                textView.text = charCounter.toString() + R.string.ofFifty
            }
            else{
                textView.setTextColor(getColor(context, R.color.colorAccent))
                textView.text = charCounter.toString() + R.string.ofFifty
            }
        }

    })
}
fun onIputTextViewFocusChange(b: Boolean, textView: TextView){
    if (b){
        textView.visibility = View.VISIBLE
    }
    else{
        textView.visibility = View.INVISIBLE
    }
}