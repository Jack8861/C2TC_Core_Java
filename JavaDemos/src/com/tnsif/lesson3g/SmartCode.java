// program to demostrate usage of source command in eclipse

package com.tnsif.lesson3g;

class Car1 {
	private String carName;
	private Integer topSpeed;
	public String carModel;
	public Integer noSeats;
	public Integer noGears;
	
	public Car1(String carName, Integer topSpeed, String carModel, Integer noSeats, Integer noGears) {
		super();
		this.carName = carName;
		this.topSpeed = topSpeed;
		this.carModel = carModel;
		this.noSeats = noSeats;
		this.noGears = noGears;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Integer getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(Integer topSpeed) {
		
		this.topSpeed = topSpeed;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
}

public class SmartCode {
	
	public static void main(String args[]) {
	Car1 obj = new Car1();
//	obj.dispOutput();
}
}