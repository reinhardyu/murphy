package com.murphy.test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author 杨成雨
 * @create 2017-10-31 9:42
 */
@Component
public class QuartzTest extends BaseJunit4Test {

    @org.junit.Test
    @Scheduled(cron = "0 0/1 * * * ?")
    public void test(){
        System.out.println("Quartz");
    }
}