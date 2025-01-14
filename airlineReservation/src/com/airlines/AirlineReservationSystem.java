package com.airlines;
import java.util.Scanner;
public class AirlineReservationSystem {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Available international flights from Bengaluru
	        Flight flight1 = new Flight("AI101", "Bengaluru", "New York", 100, 5000, 10000);
	        Flight flight2 = new Flight("AI102", "Bengaluru", "Switzerland", 80, 6000, 12000);
	        Flight flight3 = new Flight("AI103", "Bengaluru", "Paris", 120, 5500, 11000);
	        Flight flight4 = new Flight("AI104", "Bengaluru", "Hong Kong", 150, 4500, 9000);
	        Flight flight5 = new Flight("AI105", "Bengaluru", "Dubai", 130, 4000, 8000);
	        Flight flight6 = new Flight("AI106", "Bengaluru", "Thailand", 110, 3500, 7000);
	        Flight flight7 = new Flight("AI107", "Bengaluru", "Bali", 90, 4500, 9000);
	        Flight flight8 = new Flight("AI108", "Bengaluru", "Indonesia", 100, 4800, 9600);
	        Flight flight9 = new Flight("AI109", "Bengaluru", "Vietnam", 85, 4300, 8600);
	        Flight flight10 = new Flight("AI110", "Bengaluru", "Singapore", 95, 4700, 9400);
	        Flight flight11 = new Flight("AI111", "Bengaluru", "Malaysia", 100, 5000, 10000);

	        // Available domestic flights within India from Bengaluru
	        Flight flight12 = new Flight("AI201", "Bengaluru", "Mumbai", 80, 3000, 6000);
	        Flight flight13 = new Flight("AI202", "Bengaluru", "Delhi", 100, 3500, 7000);
	        Flight flight14 = new Flight("AI203", "Bengaluru", "Chennai", 120, 2500, 5000);
	        Flight flight15 = new Flight("AI204", "Bengaluru", "Hyderabad", 130, 2800, 5600);
	        Flight flight16 = new Flight("AI205", "Bengaluru", "Kochi", 90, 2300, 4600);
	        Flight flight17 = new Flight("AI206", "Bengaluru", "Goa", 110, 2700, 5400);
	        Flight flight18 = new Flight("AI207", "Bengaluru", "Kolkata", 85, 3200, 6400);

	        // Available bookings (simulated database)
	        BookingSystem bookingSystem = new BookingSystem();
	        
	        System.out.println("Welcome to Airline Reservation System");
	        System.out.println("1. Book a ticket");
	        System.out.println("2. View available flights");
	        System.out.println("3. Cancel a ticket");
	        System.out.println("4. Exit");

	        while (true) {
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();  // Consume the newline

	            switch (choice) {
	                case 1:
	                    System.out.println("Booking a ticket...");
	                    System.out.print("Enter your name: ");
	                    String passengerName = scanner.nextLine();
	                    System.out.println("Available flights: ");
	                    displayFlights(flight1, flight2, flight3, flight4, flight5, flight6, flight7, flight8, flight9, flight10, flight11, flight12, flight13, flight14, flight15, flight16, flight17, flight18);
	                    System.out.print("Choose flight by number: ");
	                    int flightChoice = scanner.nextInt();
	                    scanner.nextLine();  // Consume the newline
	                    System.out.print("Enter class (1 for Economy, 2 for Business): ");
	                    int classChoice = scanner.nextInt();
	                    Flight selectedFlight = getFlightByChoice(flightChoice, flight1, flight2, flight3, flight4, flight5, flight6, flight7, flight8, flight9, flight10, flight11, flight12, flight13, flight14, flight15, flight16, flight17, flight18);
	                    String ticketClass = (classChoice == 1) ? "Economy" : "Business";
	                    double price = selectedFlight.getPrice(ticketClass);

	                    if (selectedFlight != null && selectedFlight.bookTicket(passengerName)) {
	                        bookingSystem.addBooking(passengerName, selectedFlight.getFlightNumber(), ticketClass, price);
	                        System.out.println("Ticket booked successfully! Price: " + price);
	                    } else {
	                        System.out.println("Sorry, no available seats or invalid flight number.");
	                    }
	                    break;
	                case 2:
	                    System.out.println("Available flights:");
	                    displayFlights(flight1, flight2, flight3, flight4, flight5, flight6, flight7, flight8, flight9, flight10, flight11, flight12, flight13, flight14, flight15, flight16, flight17, flight18);
	                    break;
	                case 3:
	                    System.out.println("Canceling a ticket...");
	                    System.out.print("Enter your name: ");
	                    String cancelPassengerName = scanner.nextLine();
	                    if (bookingSystem.cancelBooking(cancelPassengerName)) {
	                        System.out.println("Ticket canceled successfully.");
	                    } else {
	                        System.out.println("No booking found for " + cancelPassengerName);
	                    }
	                    break;
	                case 4:
	                    System.out.println("Exiting the system.");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    // Method to display flight details
	    public static void displayFlights(Flight... flights) {
	        for (int i = 0; i < flights.length; i++) {
	            flights[i].displayFlightDetails(i + 1);
	        }
	    }

	    // Method to get flight by choice
	    public static Flight getFlightByChoice(int choice, Flight... flights) {
	        if (choice >= 1 && choice <= flights.length) {
	            return flights[choice - 1];
	        }
	        return null;
	    }
	}



