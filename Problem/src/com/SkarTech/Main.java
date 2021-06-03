package com.SkarTech;

public class Main {

	public static void main(String[] args) {
//		SimpleCalculator calculator = new SimpleCalculator();
//		calculator.setFirstNumber(5.0);
//		calculator.setSecondNumber(4);
//		System.out.println("add= " + calculator.getAdditionResult());
//		System.out.println("subtract= " + calculator.getSubtractionResult());
//		calculator.setFirstNumber(5.25);
//		calculator.setSecondNumber(0);
//		System.out.println("multiply= " + calculator.getMultiplicationResult());
//		System.out.println("divide= " + calculator.getDivisionResult());




//		person.setFirstName("");   // firstName is set to empty string
//		person.setLastName("");    // lastName is set to empty string
//		person.setAge(10);
//		System.out.println("fullName= " + person.getFullName());
////		person.isTeen();
//		System.out.println("teen= " + person.isTeen());
//		person.setFirstName("John");    // firstName is set to John
//		person.setAge(18);
//		System.out.println("fullName= " + person.getFullName());
//		System.out.println("teen= " + person.isTeen());
//		person.setLastName("Smith");    // lastName is set to Smith
//		System.out.println("fullName= " + person.getFullName());

//
//		VipCustomer Mr_Sarkar=new VipCustomer("Siddhant Sarkar",999999999,"siddhant.sarkar999@gmail.com");
//		System.out.println(Mr_Sarkar.getAccount_Number());
////		System.out.println(Mr_Sarkar.getAccount_Number());
//
//
//		ComplexNumber one = new ComplexNumber(1.0, 1.0);
//		ComplexNumber number = new ComplexNumber(2.5, -1.5);
//		one.add(1,1);
//		System.out.println("one.real= " + one.getReal());
//		System.out.println("one.imaginary= " + one.getImaginary());
//		one.subtract(number);
//		System.out.println("one.real= " + one.getReal());
//		System.out.println("one.imaginary= " + one.getImaginary());
//		number.subtract(one);
//		System.out.println("number.real= " + number.getReal());
//		System.out.println("number.imaginary= " + number.getImaginary());

		Circle circle = new Circle(3.75);
		System.out.println("circle.radius= " + circle.getRadius());
		System.out.println("circle.area= " + circle.getArea());
		Cylinder cylinder = new Cylinder(5.55, 7.25);
		System.out.println("cylinder.radius= " + cylinder.getRadius());
		System.out.println("cylinder.height= " + cylinder.getHeight());
		System.out.println("cylinder.area= " + cylinder.getArea());
		System.out.println("cylinder.volume= " + cylinder.getVolume());

	}
}
