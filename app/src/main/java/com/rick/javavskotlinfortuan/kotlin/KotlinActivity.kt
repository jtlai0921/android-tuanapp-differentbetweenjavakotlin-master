package com.rick.javavskotlinfortuan.kotlin

import android.content.Intent
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.rick.javavskotlinfortuan.R
import com.rick.javavskotlinfortuan.kotlin.activity.KotlinInputActivity
import com.rick.javavskotlinfortuan.kotlin.fragment.JetPackFragment
import com.rick.javavskotlinfortuan.kotlin.fragment.OCAFragment
import com.rick.javavskotlinfortuan.kotlin.fragment.OCPFragment
import com.rick.javavskotlinfortuan.kotlin.fragment.ProductFragment
import com.rick.javavskotlinfortuan.kotlin.spec.Reportable
import com.rick.javavskotlinfortuan.kotlin.vo.MyData
import com.rick.javavskotlinfortuan.others.MyGestureListener
import kotlinx.android.synthetic.main.activity_shop.*
import java.text.SimpleDateFormat

class KotlinActivity : AppCompatActivity() {

    companion object {
        val TAG = KotlinActivity::class.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        tv_title.text = "歡迎瀏覽「段維瀚老師」線上課程"
        tv_date.text = SimpleDateFormat("yyyy/MM/dd").format(System.currentTimeMillis())
        tv_ps.text = "by Kotlin"

        detector = GestureDetector(this, object : MyGestureListener() {
            override fun onFling(e1: MotionEvent?, e2: MotionEvent?, velocityX: Float, velocityY: Float): Boolean {
                var xDiff = e1!!.x - e2!!.x
                return if (Math.abs(xDiff) > FLIP_DISTANCE) {
                    transFragmentPage(currentFragment.productIdx + (xDiff / Math.abs(xDiff)).toInt())
                    true
                } else false
            }
        })

        transFragmentPage(0)
    }

    private lateinit var currentFragment: ProductFragment

    fun transFragmentPage(idx: Int) {
        currentFragment = when (idx) {
            0 -> OCAFragment.intance
            1 -> OCPFragment.intance
            2 -> JetPackFragment.intance
            else -> return
        }
        supportFragmentManager.beginTransaction().replace(R.id.container, currentFragment).commit()
    }

    override fun onDestroy() {
        super.onDestroy()
//        (currentFragment as Reportable).report(currentFragment::class.simpleName)

        currentFragment.let {
            if (it is Reportable) it.report(currentFragment::class.simpleName)
        }
    }

    private lateinit var detector: GestureDetector

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return detector.onTouchEvent(event)
    }

    fun onClick(view: View) {
        val mData = getMyData(
            tv_title.text.toString(),
            tv_date.text.toString(),
            tv_ps.text.toString(),
            currentFragment.productIdx,
            currentFragment.productPic,
            currentFragment.productName
        )

        val bundle = Bundle()
        bundle.putSerializable("mData", mData)
        startActivity(Intent(this, KotlinInputActivity::class.java).putExtras(bundle))
    }

    private fun getMyData(
        title: String, date: String, ps: String,
        productIdx: Int, productPic: Int, productName: String,
        currentTime: Long = System.currentTimeMillis(),
        tag: String = TAG!!
    ): MyData = MyData(title, date, ps, productIdx, productPic, productName, currentTime, tag)
}
