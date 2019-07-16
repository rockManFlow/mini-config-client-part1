package com.rock.client.task;

import org.junit.Test;

import java.util.Timer;

/**
 * @author caoqingyuan
 * @detail
 * @date 2019/7/16 18:39
 */
public class TaskTest {

    @Test
    public void testTask(){
    }

    public static void main(String[] args){
        Timer timer=new Timer();
        timer.schedule(new PrintTask(),1000L,2000L);
    }
}
