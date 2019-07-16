package com.rock.client;

import com.rock.client.task.PrintTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.util.Timer;

@SpringBootApplication(scanBasePackages = "com.rock.client")
public class ConfigClientApplication {
    @Resource
    private PrintTask printTask;
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);

        Timer timer=new Timer();
        timer.schedule(new PrintTask(),1000L,2000L);
    }
}
