package org.shubham2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
class xyz1{
    public xyz1() {
        System.out.println("constructer created ");
    }

    int age;
    public void setAge(int age) {//without setters spring can not assign
        this.age = age;
    }

    public void f1() {
        System.out.println("f1 "+age);
    }
}
class xyz2{
    public void f2() {
        System.out.println("f2");
    }
}
class  xyz3{
    public xyz3() {
        System.out.println("constructer3 cretaed");
    }
}
public class App
{
    public static void main( String[] args )
    {System.out.println( "Hello World!" );
    ApplicationContext o1=new ClassPathXmlApplicationContext("s1.xml");
     xyz1 x1= (xyz1) o1.getBean("id1"); //m-1
     x1.f1();
     System.out.println(x1.age);

      xyz2 x2=o1.getBean(xyz2.class);//m-2
      x2.f2();

      xyz3 x3= (xyz3) o1.getBean("id3");//if make 2 bean constructer call 2 times for xyz3
    }
}
