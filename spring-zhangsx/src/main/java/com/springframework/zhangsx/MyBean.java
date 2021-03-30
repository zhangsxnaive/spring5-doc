package com.springframework.zhangsx;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author 张书新
 * @version 1.0
 * @date 2021/3/29 11:02 下午
 */
public class MyBean implements InitializingBean {

	public MyBean() {
		System.out.println("MyBean 构造器。。。");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MyBean afterPropertiesSet。。。");
	}
}
