package com.rick.javavskotlinfortuan.kotlin.vo

import java.io.Serializable

data class MyData(
    val title: String, val date: String, val ps: String,
    val productIdx: Int, val productPic: Int, val productName: String,
    val currentTime: Long, val tag: String
) : Serializable