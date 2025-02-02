package Injection1.injected;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
interface  c1{
	public  void f2();
}
@Component
class c2 implements c1{
	@Override
	public  void f2() {
		System.out.println("f2");
	}
}
@Component
class c3{
	/*@Autowired field injection
	c2 ob2;*/

	/*c2 ob2;
	@Autowired      constructer injection
	public c3(c2 ob2) {
		this.ob2 = ob2;
	}*/

	c2 ob2;
	@Autowired  //setter injection
	public void setOb2(c2 ob2) {
		this.ob2 = ob2;
	}

	public  void f3() {
		System.out.println("f3");
		ob2.f2();
	}
	//ob2.f2(); y can not write here do in method
}
@SpringBootApplication
public class InjectedApplication {

	public static void main(String[] args) {

	ApplicationContext ctx=SpringApplication.run(InjectedApplication.class, args);
	c3 ob3=ctx.getBean(c3.class);
	ob3.f3(); // o/p f3 f2

	}

}
