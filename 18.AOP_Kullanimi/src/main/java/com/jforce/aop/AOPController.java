package com.jforce.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component("aopController")
public class AOPController {
    
	
	
//	@Before("execution(* com.jforce.model.Personel.personelInfo(..))")	
//	public void beforePersonelnfo(JoinPoint joinPoint)
//	{
//		System.out.println("***ÖNCE***  " + joinPoint.getSignature());
//	}
//	
//	@After("execution (* com.jforce.model.Personel.personelInfo(..))")
//	public void afterPersonelInfo(JoinPoint joinPoint)
//	{
//		System.out.println("***SONRA*** " + joinPoint.getSignature());
//	}
	
//	@AfterReturning("execution(* com.jforce.model.Personel.personelInfo(..))")
//	public void returningPersonelInfo(JoinPoint joinPoint)
//	{
//		System.out.println("***DEĞER DÖNDÜRDÜKTEN SONRA*** " + joinPoint.getSignature());
//	}
	
//	@AfterThrowing("execution(* com.jforce.model.Personel.personelInfo(..))")
//	public  void throwingPersonelInfo(JoinPoint joinPoint)
//	{
//		System.out.println("***EXCEPTİON FIRLATILDIKTAN SONRA***    :"+ joinPoint.getSignature());
//	}
//	
	
	//Around  : @Before ve @After anatasyonlarının birleşimidir. ve ProcessingJoinPoint kullanılır.

	
	// execution 'dan sonrasındaki *(yıldız) metodun geriye dönüş tipini beliritir.
	@Around("execution(void com.jforce.model.Personel.personelInfo(..))")
	public void aroundPersonelInfo(ProceedingJoinPoint joinPoint)
	{
		System.out.println("***ÖNCESİ***");
			try {
				joinPoint.proceed();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		System.out.println("***SONRASI***");
	}
	
	
	
	
	
	
}
