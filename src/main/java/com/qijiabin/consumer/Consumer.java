package com.qijiabin.consumer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qijiabin.rpc.SpeakInterface;

/**
 * 消息者测试类
 * @author jackson
 *
 */
public class Consumer {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-dubbo-consumer.xml" });
		context.start();
		
		SpeakInterface speakInterface = (SpeakInterface) context.getBean("speakInterface");
		String result = speakInterface.speak("tom");
		System.out.println(result);
	}
	
}

