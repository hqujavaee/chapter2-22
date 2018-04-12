package cn.edu.hqu.javaee.domain.Dessert.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import cn.edu.hqu.javaee.domain.Dessert.Consumer;
import cn.edu.hqu.javaee.domain.Dessert.Dessert;

@Component
@PropertySource("classpath:application.properties" )
public class Child implements Consumer {
	//采用Spel表达式注入字面值
	@Value("#{'张三'}") String name;
	@Value("#{'KFC'}")String location;
	@Autowired
	private Dessert dessert;

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		System.out.print("采用Spel表达式注入字面值："+name+"在"+location);
		dessert.eat();
	}
}
