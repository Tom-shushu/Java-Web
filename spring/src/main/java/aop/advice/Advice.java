package aop.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("advice")
@Aspect   // ����ǰ����ඨ�����һ��������,��һЩ���й�ע�㼯������,����ʹ��
public class Advice {

	// �����������һ�����й�ע��
	// @Before���ں��Ĺ�ע��ִ��֮ǰִ��,��Щ���Ĺ�ע����?
	// ����aop.target.������.���ⷽ��(�������) ���Ǻ��Ĺ�ע��
	//@Before("execution(* aop.target.*.*(..))")
	public void before(){
		System.out.println("���,����Advice���before����!");
	}
	
}

// AOP:�����ط�������------>�������¼���������

/*
 * 1.��Ϊ���Ĺ�ע��ͺ��й�ע��
 * 2.���Ĺ�ע����Ǵ�����������һЩ����(����),����add,update,delete��select
 * 3.�����µ�һЩҵ��,��ִ��ɢ�����Щ���Ĺ�ע��ʱ,��Ҫͬʱִ��һЩд����־����
 * 4.ԭ�еķ�ʽ:����дһ������,����Щ���Ĺ�ע��ִ����ɺ�,�����������
 * 4.��������������:��д����־�ķ�������д�ɺ��й�ע��,Ȼ����д����־�ķ����ϸ�����,
 * ��Щ���Ĺ�ע����Ҫ������
 * 
 */
