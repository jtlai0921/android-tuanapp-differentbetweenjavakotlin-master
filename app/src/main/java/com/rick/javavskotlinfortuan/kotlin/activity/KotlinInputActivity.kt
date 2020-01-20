package com.rick.javavskotlinfortuan.kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rick.javavskotlinfortuan.R
import com.rick.javavskotlinfortuan.java.vo.MyData
import com.rick.javavskotlinfortuan.kotlin.ext.setOnTextChangedListener
import kotlinx.android.synthetic.main.activity_input.*

class KotlinInputActivity : AppCompatActivity() {

    companion object {
        val TAG = KotlinInputActivity::class.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        val mData = intent.extras?.get("mData") as MyData ?: Unit
        Log.d(TAG, "onCreate:$mData")

        ed_name.setOnTextChangedListener {
            // code here
        }

        ed_height.setOnTextChangedListener {
            // code here
        }

        ed_weight.setOnTextChangedListener {
            // code here
        }

        ed_age.setOnTextChangedListener {
            // code here
        }

        ed_phone.setOnTextChangedListener {
            // code here
        }

        ed_productName.setOnTextChangedListener {
            // code here
        }

        ed_date.setOnTextChangedListener {
            // code here
        }

        ed_gender.setOnTextChangedListener {
            // code here
        }
    }
}
