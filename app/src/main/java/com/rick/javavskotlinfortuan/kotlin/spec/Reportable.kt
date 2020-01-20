package com.rick.javavskotlinfortuan.kotlin.spec

import android.util.Log

interface Reportable {

    companion object {
        val TAG = Reportable::class.simpleName
    }

    fun report(info: String?) {
        // do report...
        Log.d(TAG, "report: $info")
    }
}
