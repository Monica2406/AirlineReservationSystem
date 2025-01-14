package com.airlines;
import java.util.HashMap;
import java.util.Map;
public class BookingSystem {
	
	    private Map<String, Booking> bookings;

	    public BookingSystem() {
	        bookings = new HashMap<>();
	    }

	    public void addBooking(String passengerName, String flightNumber, String ticketClass, double price) {
	        bookings.put(passengerName, new Booking(passengerName, flightNumber, ticketClass, price));
	    }

	    public boolean cancelBooking(String passengerName) {
	        if (bookings.containsKey(passengerName)) {
	            bookings.remove(passengerName);
	            return true;
	        }
	        return false;
	    }
	}

	class Booking {
	    private String passengerName;
	    private String flightNumber;
	    private String ticketClass;
	    private double price;

	    public Booking(String passengerName, String flightNumber, String ticketClass, double price) {
	        this.passengerName = passengerName;
	        this.flightNumber = flightNumber;
	        this.ticketClass = ticketClass;
	        this.price = price;
	    }

	    public String getPassengerName() {
	        return passengerName;
	    }

	    public String getFlightNumber() {
	        return flightNumber;
	    }

	    public String getTicketClass() {
	        return ticketClass;
	    }

	    public double getPrice() {
	        return price;
	    }
	}



