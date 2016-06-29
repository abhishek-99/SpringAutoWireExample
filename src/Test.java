import org.springframework.context.*;
import org.springframework.context.support.*;
public class Test {
	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("applicationcontext.xml");
Employee emp= (Employee) context.getBean("emp");
System.out.println(emp.toString());
	}

}
