package com.ankit.xyz1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
@Component
class xyz2{
   public  void f2() {
		System.out.println("f2");
	 }
}
@Component
class xyz1  {
	xyz2 x2;
	
	public xyz1(xyz2 x2) {
		this.x2 = x2;
	}
}
@SpringBootApplication
public class Xyz1Application {
	public static void main(String[] args) {
		ApplicationContext op = SpringApplication.run(Xyz1Application.class, args);
		System.out.println("hello world");
		xyz1 x1 = op.getBean(xyz1.class);
		System.out.println(x1);//
		x1.x2.f2();
	}
}
