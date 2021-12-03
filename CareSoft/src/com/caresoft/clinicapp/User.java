package com.caresoft.clinicapp;

public class User {
    protected Integer id;
    protected int pin;
    
    // TO DO: Getters and setters
    // Implement a constructor that takes an ID
	public User(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getPin() {
		return this.pin;
	}
	
	public void setPin(int num) {
		int count = 0;
		for(; num != count ; num /= 10, ++count) {
		}
		if(count < 4) {
			System.out.println("Invalid pin, must be 4 numbers long.");
		}else if(count == 4 && count < 5) {
			this.pin = num;
			System.out.println("Successfully set pin.");
		}else {
			System.out.println("Something went wrong, try again.");
		}
	}

}
