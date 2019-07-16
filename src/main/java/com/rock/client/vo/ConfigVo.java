package com.rock.client.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author caoqingyuan
 * @detail
 * @date 2019/7/16 18:14
 */
@Configuration
public class ConfigVo {
    @Value("${config.name}")
    private String name;
    @Value("${config.value}")
    private String value;
    @Value("${config.detail}")
    private String detail;

    @PostConstruct
    public void init(){
    }

    public String toString(){
        return name+"#"+value+"#"+detail;
    }
}
