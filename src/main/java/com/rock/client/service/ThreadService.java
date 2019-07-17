package com.rock.client.service;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author caoqingyuan
 * @detail
 * @date 2019/7/17 18:03
 */
public class ThreadService {
    public static void main(String[] args){
        System.out.println("start");
        threadSecurty();
        System.out.println("end");
    }

    private static void threadSecurty(){
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
        String[] stringDate=new String[]{
                "2019-08-18 12:10:10",
                "2029-08-18 12:10:10",
                "2039-08-18 12:10:10",
                "2049-08-18 12:10:10",
                "2015-08-18 11:10:10",
                "2013-08-18 10:10:10"
        };
        Arrays.stream(stringDate).forEach(dateStr->{
            pool.execute(()->{
                try {
                    //一个线程使用自己独有的处理对象
                    SimpleDateFormatFactory.getInstance("yyyy-MM-dd HH:mm:ss").parse(dateStr);
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        });
    }

    public static void threadNoSecurty(){
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
        String[] stringDate=new String[]{
                "2019-08-18 12:10:10",
                "2029-08-18 12:10:10",
                "2039-08-18 12:10:10",
                "2049-08-18 12:10:10",
                "2015-08-18 11:10:10",
                "2013-08-18 10:10:10"
        };
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Arrays.stream(stringDate).forEach(dateStr->{
            pool.execute(()->{
                try {
                    //存在线程安全问题
                    simpleDateFormat.parse(dateStr);
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        });
    }
}
