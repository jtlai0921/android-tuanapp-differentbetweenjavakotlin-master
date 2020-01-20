package com.rick.javavskotlinfortuan.kotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rick.javavskotlinfortuan.R
import com.rick.javavskotlinfortuan.kotlin.spec.Reportable
import kotlinx.android.synthetic.main.fragment.*

class OCAFragment : ProductFragment(0, R.drawable.ocaocp, "猛虎出柙 - Java 1z0-808原廠認證衝刺班"), Reportable {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment, container, false)
    }

    override fun onStart() {
        super.onStart()
        iv_pic.setImageDrawable(resources.getDrawable(productPic))
        tv_ps.text = productName
    }

    companion object {
        val intance = OCAFragment()
    }
}

class OCPFragment : ProductFragment(1, R.drawable.ocaocp, "猛虎出柙 - 邁向Java 8專業認證1z0-809"), Reportable {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment, container, false)
    }

    override fun onStart() {
        super.onStart()
        iv_pic.setImageDrawable(resources.getDrawable(productPic))
        tv_ps.text = productName
    }

    companion object {
        val intance = OCPFragment()
    }
}

class JetPackFragment : ProductFragment(2, R.drawable.jetpack, "Google AAD證照暨Jetpack軟體應用實務開發") {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment, container, false)
    }

    override fun onStart() {
        super.onStart()
        iv_pic.setImageDrawable(resources.getDrawable(productPic))
        tv_ps.text = productName
    }

    companion object {
        val intance = JetPackFragment()
    }
}

open class ProductFragment(val productIdx: Int, val productPic: Int, val productName: String) : Fragment()