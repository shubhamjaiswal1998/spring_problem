package org.shubham3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
class  xyz2{
    int age1;
    public void f2() {
        System.out.println("f2");
    }

    public  void f3() {
        System.out.println("f3 and age "+age1);
    }
}
class xyz1{
    int age;
   String name;
   xyz2 xyz2_var;
    public xyz1(int age,String name,xyz2 xyz2_var) {
        this.age = age; this.name=name; this.xyz2_var=xyz2_var;
    }
}
public class App
{ public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext c1=new ClassPathXmlApplicationContext("s1.xml");
        xyz1 x1= (xyz1) c1.getBean("id1");
        System.out.println(x1.age+" "+x1.name+" "+x1.xyz2_var);
        //45 aman org.shubham3.xyz2@222114ba
        x1.xyz2_var.f2();//f2
        x1.xyz2_var.f3();//f3 and age 0
    }
}
