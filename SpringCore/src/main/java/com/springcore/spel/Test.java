package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spel/spel.xml");
		Demo d1=context.getBean("demo",Demo.class);
		
		System.out.println(d1);
		
//		SpelExpressionParser temp=new SpelExpressionParser();
//		Expression expression=(Expression) temp.parseExpression("11+11");
//		System.out.println(expression);
			
	}

}
