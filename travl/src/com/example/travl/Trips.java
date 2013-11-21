package com.example.travl;

import java.util.UUID;

public class Trips {
	
	private String Destination;
	private String Duration;
	private String Currency;
	private String Budget;
	
	private UUID idNumber;
	
	
	public void Trip(){
		
		idNumber = UUID.randomUUID();
		
		
	}

	public UUID getIdNumber() {
		return idNumber;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public String getBudget() {
		return Budget;
	}

	public void setBudget(String budget) {
		Budget = budget;
	}
	
	

}
