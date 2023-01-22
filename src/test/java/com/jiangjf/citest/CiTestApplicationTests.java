package com.jiangjf.citest;

import com.jiangjf.citest.service.CalcService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class CiTestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    CalcService calcService;

    @Test
    public void testAdd()
    {
        int sum = calcService.add(1, 3);
        assert sum == 4;
        System.out.println("test add 呵呵！！");
    }

}
