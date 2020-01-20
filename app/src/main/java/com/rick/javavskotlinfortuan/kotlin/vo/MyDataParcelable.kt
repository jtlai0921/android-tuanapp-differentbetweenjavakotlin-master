package com.rick.javavskotlinfortuan.kotlin.vo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MyDataParcelable(
    val title: String, val date: String, val ps: String,
    val productIdx: Int, val productPic: Int, val productName: String,
    val currentTime: Long, val tag: String
) : Parcelable