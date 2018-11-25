package aop.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("advice")
@Aspect   // 将当前这个类定义成了一个切面类,将一些横切关注点集中起来,方便使用
public class Advice {

	// 这个方法就是一个横切关注点
	// @Before会在核心关注点执行之前执行,那些核心关注点呢?
	// 凡是aop.target.任意类.任意方法(任意参数) 都是核心关注点
	//@Before("execution(* aop.target.*.*(..))")
	public void before(){
		System.out.println("你好,我是Advice类的before方法!");
	}
	
}

// AOP:主动地方法调用------>被动的事件驱动机制

/*
 * 1.分为核心关注点和横切关注点
 * 2.核心关注点就是处理基本问题的一些功能(方法),例如add,update,delete和select
 * 3.有如下的一些业务,当执行散落的这些核心关注点时,想要同时执行一些写入日志方法
 * 4.原有的方式:就是写一个方法,让这些核心关注点执行完成后,调用这个方法
 * 4.现在我这样处理:将写入日志的方法给他写成横切关注点,然后在写入日志的方法上告诉它,
 * 哪些核心关注点需要调用它
 * 
 */
