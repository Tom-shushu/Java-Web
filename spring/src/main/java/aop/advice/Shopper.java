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
@Aspect // ��������ھ���һ������
public class Shopper {

	@Pointcut("execution(* aop.target.Customer.*(..))")
	public void anymethod(){}
	
	@Before(value="anymethod()")
	public void welcome(){
		System.out.println("��ӭ����!");
	}
	
	@AfterReturning(value="anymethod()")
	public void goodby(){
		System.out.println("��ӭ�´ι���!");
	}
	
	@Around(value="anymethod()")
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		Class c = pjp.getClass();
		Object obj = pjp.getTarget();
		Object[] params = pjp.getArgs();
		System.out.println("����!");
		pjp.proceed();//���Ŀ����󷽷�ִ��
		System.out.println("��ѽ!");
	}
	
	@AfterThrowing(value="anymethod()",throwing="e")
	public void error(Exception e){
		System.out.println(e.getMessage());
		System.out.println("�쳣ִ֪ͨ����!");
	}
	
	@Before("execution(* aop.target.Customer.*(..))&&args(name,price)")
	public void demo(String name,double price){
		System.out.println("�˿�׼������:"+name+",���ʹ���:"+price+"Ԫ");
	}
	
}
