package com.rock.client.task;

import com.rock.client.vo.ConfigVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.TimerTask;

/**
 * @author caoqingyuan
 * @detail 打印定时任务
 * @date 2019/7/16 18:32
 */
@Component
@Slf4j
public class PrintTask extends TimerTask {
    @Resource
    private ConfigVo configVo;
    private long runCount=0L;
    @Override
    public void run() {
        log.info("Start Run Print Task");
        runCount++;
        log.info("configVo="+configVo);
        log.info("Run Count="+runCount);
        log.info("End Run Print Task");
    }

    public PrintTask(){
        log.info("PrintTask init");
    }
}
