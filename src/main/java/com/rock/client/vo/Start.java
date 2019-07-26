package com.rock.client.vo;

import com.rock.client.task.CountTask;
import com.rock.client.task.InsertDataTask;
import com.rock.client.task.PrintTask;
import com.rock.client.task.VerifyReqTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Timer;

/**
 * @author caoqingyuan
 * @detail
 * @date 2019/7/16 18:51
 */
@Component
@Slf4j
public class Start implements InitializingBean {
    @Resource
    private PrintTask printTask;
    @Resource
    private VerifyReqTask verifyReqTask;
    @Resource
    private CountTask countTask;
    @Resource
    private InsertDataTask insertDataTask;
    Start(){
        log.info("Start构造函数执行");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("afterPropertiesSet");
        Timer timer=new Timer();
//        timer.schedule(printTask,1000L,2000L);

//        timer.schedule(verifyReqTask,3000L,2000L);

//        timer.schedule(countTask,3000L);

        timer.schedule(insertDataTask,1000L,1000L);
    }
}
