package com.airlines;
import java.util.ArrayList;
import java.util.List;
public class Flight {
	
	    private String flightNumber;
	    private String source;
	    private String destination;
	    private int totalSeats;
	    private List<String> bookedPassengers;
	    private double economyPrice;
	    private double businessPrice;

	    public Flight(String flightNumber, String source, String destination, int totalSeats, double economyPrice, double businessPrice) {
	        this.flightNumber = flightNumber;
	        this.source = source;
	        this.destination = destination;
	        this.totalSeats = totalSeats;
	        this.bookedPassengers = new ArrayList<>();
	        this.economyPrice = economyPrice;
	        this.businessPrice = businessPrice;
	    }

	    public boolean bookTicket(String passengerName) {
	        if (bookedPassengers.size() < totalSeats) {
	            bookedPassengers.add(passengerName);
	            return true;
	        }
	        return false;
	    }

	    public boolean cancelTicket(String passengerName) {
	        return bookedPassengers.remove(passengerName);
	    }

	    public void displayFlightDetails(int flightNumber) {
	        System.out.println(flightNumber + ". Flight " + this.flightNumber + " from " + this.source + " to " + this.destination + " | Seats Available: " + (totalSeats - bookedPassengers.size()));
	    }

	    public double getPrice(String ticketClass) {
	        return ticketClass.equals("Economy") ? economyPrice : businessPrice;
	    }

	    public String getFlightNumber() {
	        return flightNumber;
	    }
	}



