package cn.mi.daggersample;

import android.util.Log;

/**
 * Created by Jackwang on 08/06/2018.
 * Email: jackwang2048@gmail.com
 * Github: wangjie2013
 */

public final class Utils {
    private static final String LOG = "log";

    private Utils() {

    }

    public static void print(String msg) {
        Log.i(LOG, msg);
    }
}
