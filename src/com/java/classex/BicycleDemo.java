package com.java.classex;


import com.java.interfaceex.BicycleInterface;

public class BicycleDemo {

	public static void main(String[] args) {
		
		Bicycle bicycle=new Bicycle();
		Bicycle bicycle2=new Bicycle();
		
		bicycle.changeCadence(50);
		bicycle.changeGear(3);
		bicycle.speedUp(10);
		bicycle.toString();
		
		bicycle2.changeCadence(100);
		bicycle2.speedUp(100);
		bicycle2.changeGear(4);
		bicycle2.toString();
	}
}
class Bicycle implements BicycleInterface{
	int cadence =0;
	int speed =0;
	int gear=1;
	
	public void changeCadence(int newValue) {
		cadence=newValue;
	}
	
	public void changeGear(int newValue) {
		gear=newValue;
	}
	public void speedUp(int increament) {
		speed= speed+increament;
	}
	
	public void applyBreak(int decreament) {
		speed=speed-decreament;
	}

	@Override
	public String toString() {
		
		System.out.println("Bicycle [cadence=" + cadence + ", speed=" + speed + ", gear=" + gear + "]");
		return "Bicycle [cadence=" + cadence + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
}