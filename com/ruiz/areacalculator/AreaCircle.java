package com.ruiz.areacalculator;

public class AreaCircle {
	static double area = 0;
	static double radius = 2;
	static double myPi =3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcAreaOfCircle(myPi,radius);
		displayArea();
		
	}
	public static void calcAreaOfCircle(double x,double y) {
		area = myPi*(radius * radius);
	}
	public static void displayArea() {
		System.out.println(area);
	}
}
