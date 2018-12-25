package com.example.mrpc.textview

import android.content.Context
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompat.getColor
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

fun emailValidation(editText: EditText){
    editText.addTextChangedListener(object: TextWatcher{
        override fun afterTextChanged(p0: Editable?) {

        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        @RequiresApi(Build.VERSION_CODES.O)
        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            val charCounter: Int = editText.text.toString().length
            if (charCounter>0 && editText.text.toString().contains(" ")){
                editText.setError("Spacing is not allowed")
            }
        }

    })
}

fun passwordValidation(editText: EditText, textView: TextView, context: Context){
    editText.addTextChangedListener(object: TextWatcher{
        override fun afterTextChanged(p0: Editable?) {

        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            val charCounter: Int = editText.text.toString().length
            if (charCounter>0 && editText.text.toString().contains(" ")){
                editText.setError("Spacing is not allowed")
            }
            else{
                if (charCounter<=40){
                    textView.setTextColor(getColor(context, R.color.colorPrimary))
                    textView.text = charCounter.toString() + "/50"
                }
                else{
                    textView.setTextColor(getColor(context, R.color.colorAccent))
                    textView.text = charCounter.toString() + "/50"
                }
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