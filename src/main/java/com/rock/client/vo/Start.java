package com.rock.client.vo;

import com.rock.client.task.PrintTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.Timer;

/**
 * @author caoqingyuan
 * @detail
 * @date 2019/7/16 18:51
 */
@Component
@Slf4j
public class Start implements InitializingBean {
    private PrintTask printTask;
    Start(){
        log.info("Start构造函数执行");
        Timer timer=new Timer();
        timer.schedule(printTask,1000L,2000L);
    }

    public void setPrintTask(PrintTask printTask){
        this.printTask=printTask;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
