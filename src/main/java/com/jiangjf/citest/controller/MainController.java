package com.jiangjf.citest.controller;

import com.jiangjf.citest.service.CalcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jiangjf
 * @date 2023/1/22 21:35
 */
@RestController
public class MainController {
    @Resource
    CalcService calcService;

    @GetMapping("/add")
    public int add(int a, int b) {
        return calcService.add(a, b);
    }
}
