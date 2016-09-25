package com.hjz.service;

import org.springframework.stereotype.Service;

import com.hjz.dubbo.api.DubboServiceTest;

@Service("dubboServiceTest")
public class DubboServiceProvider implements DubboServiceTest {

	@Override
	public int calculate(int a, int b) {
		return a+b;
	}

}
