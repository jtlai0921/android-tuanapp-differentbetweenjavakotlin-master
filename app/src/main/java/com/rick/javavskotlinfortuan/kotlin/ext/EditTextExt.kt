package com.rick.javavskotlinfortuan.kotlin.ext

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

fun EditText.setOnTextChangedListener(onChanged: (String) -> Unit) {

    addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        }

        override fun afterTextChanged(s: Editable?) {
            onChanged(s.toString())
        }
    })
}