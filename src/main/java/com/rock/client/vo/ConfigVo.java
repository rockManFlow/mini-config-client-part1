package com.rock.client.vo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author caoqingyuan
 * @detail
 * @date 2019/7/16 18:14
 */
@Configuration
@Slf4j
public class ConfigVo {
    @Value("${config.name}")
    private String name;
    @Value("${config.value}")
    private String value;
    @Value("${config.detail}")
    private String detail;

    public ConfigVo(){
        log.info("ConfigVo init");
    }

    public String toString(){
        return name+"#"+value+"#"+detail;
    }
}
