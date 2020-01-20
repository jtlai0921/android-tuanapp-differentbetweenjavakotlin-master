package com.rick.javavskotlinfortuan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rick.javavskotlinfortuan.java.JavaActivity
import com.rick.javavskotlinfortuan.kotlin.KotlinActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_submit.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    if (rb_java.isChecked) JavaActivity::class.java else KotlinActivity::class.java
                )
            )
        }
    }
}
