package com.hjz.service;

import org.springframework.stereotype.Service;

import com.hjz.dubbo.api.DubboServiceTest;


/**
 * 生产者实现接口
 * @author zwc
 *
 */
@Service("dubboServiceTest")
public class DubboServiceProvider implements DubboServiceTest {

	public int calculate(int a, int b) {
		return a+b;
	}

}
