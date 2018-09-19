package com.andy.dubbo.consumer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * Hello world!
 *
 */
public class AppConsumer  {
    public static void main( String[] args ) throws IOException{
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("consumer.xml");
    	DeptServiceConsumer dsc = ctx.getBean(DeptServiceConsumer.class);
    	StopWatch sw = new StopWatch();
    	sw.start();
    	for (int i = 0; i < 100; i++) {
    		dsc.getAll();
		}
    	sw.stop();
    	System.out.println(sw.getTotalTimeSeconds());
    	
    	System.in.read();
    }
}
