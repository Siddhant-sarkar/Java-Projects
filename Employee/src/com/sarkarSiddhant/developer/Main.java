package com.sarkarSiddhant.developer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red RidingHood", 35);
        Employee charming = new Employee("Prince Charming", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);
        printEmployeeByAge(employees," over 30",employee -> employee.getAge()>=30);
        printEmployeeByAge(employees,"Under 30",employee -> employee.getAge()<=30);


        IntPredicate greaterThan15=i->i>15;
        IntPredicate lessThan100=j->j<100;
        System.out.println("Is "+25+"between the Range : "+greaterThan15.or(lessThan100).test(5));


        Random random=new Random();
        Supplier<Integer> randomSupplier=()->random.nextInt(500);
        for (int i=0;i<10;i++){
            System.out.println(randomSupplier.get());
        }

        Function<Employee,String> getLastName=(Employee employee) ->{
            return employee.getName().substring(employee.getName().indexOf(" ")+1);
        };

        Function<Employee,String>toUpper=(employee)->{
            return employee.getName().toUpperCase();
        };
        Function<String,String> getFirstName=(name) ->{
            return name.substring(name.indexOf(" ")-1);
        };
        System.out.println("Print employee last name in upper Case");
        Function chainedFunction=toUpper.andThen(getFirstName);


        chainedFunction.apply(employees.get(2));

        IntUnaryOperator inc=i->i+5;


    }
    public static void  printEmployeeByAge(List<Employee>employees, String age, Predicate<Employee>ageCondition){
        System.out.println("Employee "+age+" : ");
        System.out.println("===================");
        for (Employee employee : employees ){
            if (ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }
        System.out.println("\n\n");
    }
}
