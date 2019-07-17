package com.rock.client.service;

import java.text.SimpleDateFormat;

/**
 * @author caoqingyuan
 * @detail
 * @date 2019/7/17 18:20
 */
public class SimpleDateFormatFactory {
    private static final ThreadLocal<SimpleDateFormat> local=new ThreadLocal<>();

    public static SimpleDateFormat getInstance(String format){
        SimpleDateFormat simpleDateFormat=local.get();
        if(simpleDateFormat==null){
            simpleDateFormat=new SimpleDateFormat(format);
            local.set(simpleDateFormat);
        }
        return simpleDateFormat;
    }
}
