package com.spring.helloworld;

public class Car {
	private String brand;
	private String corp;
	private double price;
	private int maxSpeed;
	public Car(String brand, String corp, int price) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public Car(String brand, String corp, double price, int maxSpeed) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
}
