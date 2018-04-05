package com.akinyele.log_utils;

import android.util.Log;

/**
 * @author akiny.
 * Created 4/4/2018.
 */
public class LogDebug {

    private static final String TAG = "LogDebug";


    public static void d(String message) {
        Log.d(TAG, message);
    }
}
