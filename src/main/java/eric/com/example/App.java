package eric.com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Student.xml");
    	 
        Student soumen = (Student) context.getBean("studentSoumen");
        Student prosenjit = (Student) context.getBean("studentProsenjit");
        System.out.println(soumen);
        System.out.println(prosenjit);        
    }
}
