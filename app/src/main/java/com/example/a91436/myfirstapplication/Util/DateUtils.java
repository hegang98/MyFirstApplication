package com.example.a91436.myfirstapplication.Util;
import android.annotation.SuppressLint;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 91436 on 2018/4/5.
 */

public class DateUtils {
    public static String getNowDateTime() {
        SimpleDateFormat s_format = new SimpleDateFormat("yyyyMMddhhmmss");
        return s_format.format(new Date());
    }

    @SuppressLint("SimpleDateFormat")
    public static String getNowTime() {
        SimpleDateFormat s_format = new SimpleDateFormat("HH:mm:ss");
        return s_format.format(new Date());
    }
}
