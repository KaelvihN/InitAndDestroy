package com.example.initanddestroy;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;



/**
 * @author : KaelvihN
 * @date : 2023/8/18 18:14
 */

@Slf4j
public class Bean1 implements InitializingBean {

    @PostConstruct
    public void init1(){
        log.info("init1");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("init2");
    }

    public void init3(){
        log.info("init3");
    }
}
