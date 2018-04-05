package com.akinyele.error_log;

import android.util.Log;

/**
 * @author akiny.
 * Created 4/5/2018.
 */
public class ErrorLog {
    private static final String TAG = "ErrorLog";

    public static void e(String message) {
        Log.e(TAG, message);
    }
}
