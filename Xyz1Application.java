package com.ankit.xyz1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface  xyz3{
   abstract void f2();
}
@Component
class xyz2 implements  xyz3{
	public void f2() {
		System.out.println("f2");
	}
}
@Component
@Primary //first will injected xyz21 not xyz2 class
class xyz21 implements  xyz3{
	public void f2() {
		System.out.println("f21");
	}
}
@Component
class xyz1{
	 @Autowired //field injection in interface
	 xyz3 o2;
	/*public xyz1(xyz2 o2) {
		this.o2 = o2;
	}*/
	public  void f1() {
		o2.f2();
		System.out.println("f1");
	}

}
@SpringBootApplication
public class Xyz1Application {
	public static void main(String[] args) {
		ApplicationContext c1=SpringApplication.run(Xyz1Application.class, args);
		System.out.println("hello ");
		xyz1 o1=c1.getBean(xyz1.class);
		o1.f1();
	}
}
