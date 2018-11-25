package aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("shopper")
@Aspect // 这个类现在就是一个切面
public class Shopper {

	@Pointcut("execution(* aop.target.Customer.*(..))")
	public void anymethod(){}
	
	@Before(value="anymethod()")
	public void welcome(){
		System.out.println("欢迎光临!");
	}
	
	@AfterReturning(value="anymethod()")
	public void goodby(){
		System.out.println("欢迎下次光临!");
	}
	
	@Around(value="anymethod()")
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		Class c = pjp.getClass();
		Object obj = pjp.getTarget();
		Object[] params = pjp.getArgs();
		System.out.println("来了!");
		pjp.proceed();//如果目标对象方法执行
		System.out.println("走呀!");
	}
	
	@AfterThrowing(value="anymethod()",throwing="e")
	public void error(Exception e){
		System.out.println(e.getMessage());
		System.out.println("异常通知执行了!");
	}
	
	@Before("execution(* aop.target.Customer.*(..))&&args(name,price)")
	public void demo(String name,double price){
		System.out.println("顾客准备购买:"+name+",他就带了:"+price+"元");
	}
	
}
