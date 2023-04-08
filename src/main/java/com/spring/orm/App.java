package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
        
        StudentDao sdao = context.getBean("studentDao",StudentDao.class);
        
        Student student = new Student();
        student.setId(23);
        student.setName("Praveen reddy");
        student.setCity("Bangaluru");
        
       int r = sdao.insert(student);
       
       System.out.println("Done..."+r);
        
        
    }
}
