package com.SkarTech;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public Person(){
        this("Siddhant","Sarkar",18);
        System.out.println("Empty Constructor called");
    }

    public Person(String firstName){
        this(firstName,"Sarkar",18);
        System.out.println("Empty Constructor called");
    }

    public Person( String firstName,String lastName,int age){
        System.out.println("Full constructor called");
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>100||age<0){
            this.age = 0;

        }
        else{
            this.age = age;
        }
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public boolean isTeen(){
    if ((this.age>12)&&(this.age<20)){
        return true;
    }
    else{
        return false;

    }
    }
    public String getFullName(){
        if (this.firstName.isEmpty()&&this.lastName.isEmpty()){
            return "";
        }
        else if (this.firstName.isEmpty()||this.lastName.isEmpty()){
            if(this.firstName.isEmpty()){
                return this.lastName;
            }
            else{
                return this.firstName;
            }
        }
        else{
            return (firstName+" "+lastName);
        }
    }
}
