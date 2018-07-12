package com.hjz.dubbo.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.hjz.dubbo.api.DubboServiceTest;

/**
 * 消费者调用接口
 * @author zwc
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:dubbo-consumer-example.xml"})
public class DubboServiceConsumer {
	private static final Logger logger = LoggerFactory.getLogger(DubboServiceConsumer.class);
	
	/*
	 * 接口实例
	 */
	@Autowired
	private DubboServiceTest dubboServiceTest;
	
	@Test
	public void consumer(){
		int a = 4, b = 5;
		logger.info("消费dubbo服务....................");
		logger.info(String.format("a = %d, b = %d, a+b = %d", a, b, dubboServiceTest.calculate(a, b)));
	}
}
