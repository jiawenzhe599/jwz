package com.bawei.jiawenzheyuekaoA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j {
		Logger logger = LoggerFactory.getLogger(Log4j.class);
		
		
		public void test() throws Exception{
			while(true){
				logger.info("当前时间戳：{}",System.currentTimeMillis());
				Thread.sleep(1000);
			}
		}
}
