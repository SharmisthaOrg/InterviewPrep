package com.ds;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomTest {
    @Test
    public void testGroupByFRomListToMap(){
        System.out.println("hello");
        Employee emp1= new Employee("f1","b1","abc");
        Employee emp2 = new Employee("f2","b2","abc");
        Employee emp3 = new Employee("f1","b1","abcd");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);employeeList.add(emp2);employeeList.add(emp3);

        Function<Employee, String> a= employee -> employee.firm+"|"+employee.branch;
        Map<String,List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(a));
        System.out.println(map);
    }

    class Employee{
        String firm;
        String branch;
        String value;
        Employee(String firm,String branch,String value){
            this.firm = firm;
            this.branch = branch;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "firm='" + firm + '\'' +
                    ", branch='" + branch + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }
}
