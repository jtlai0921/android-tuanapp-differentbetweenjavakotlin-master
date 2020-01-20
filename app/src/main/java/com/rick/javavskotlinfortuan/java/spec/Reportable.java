package com.rick.javavskotlinfortuan.java.spec;

import android.util.Log;

public interface Reportable {

    String TAG = Reportable.class.getSimpleName();

    default void report(String info) {
        // do report...
        Log.d(TAG, "report: " + info);
    }
}
