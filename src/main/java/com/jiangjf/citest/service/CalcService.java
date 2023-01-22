package com.jiangjf.citest.service;

import org.springframework.stereotype.Service;

/**
 * @author jiangjf
 * @date 2023/1/22 21:36
 */
@Service
public class CalcService {
    public int add(int a, int b) {
        return a + b;
    }
}
