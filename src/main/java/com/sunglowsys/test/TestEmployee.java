package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        Employee employee = (Employee) context.getBean("employee");
        employee.getId();
        employee.getName();
        employee.getEmail();
        employee.getMobile();
        employee.getAddress();
        System.out.println(employee);

    }
}
