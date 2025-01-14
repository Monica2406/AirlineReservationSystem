# AirlineReservationSystem
Overview
The Airline Reservation System is a simple Java-based application that allows users to:
1.	Book flight tickets.
2.	View available flights.
3.	Cancel booked tickets.
The application supports both international and domestic flights from Bengaluru and includes options for economy and business class ticket bookings.
Features
•	Book Tickets: Select a flight, choose a class (Economy/Business), and book a ticket.
•	View Flights: Display a list of all available flights with their details, including destination and available seats.
•	Cancel Tickets: Cancel an existing booking by providing the passenger's name.
•	Pricing: Different pricing for economy and business class for each flight.
Technologies Used
•	Programming Language: Java
•	Concepts: OOP (Object-Oriented Programming), Collections (HashMap, ArrayList), Input Handling
•	Package Structure: Organized using Java packages (com.airlines).
Usage
1.	When you run the application, you will be presented with a menu:
  1: Book a Ticket
	2: View Available Flights
	3: Cancel a Ticket
	4: Exit
2.	Follow the prompts to perform the desired action.
Code Structure
•	AirlineReservationSystem.java: Entry point of the application.
•	Flight.java: Represents individual flight details and ticket management.
•	BookingSystem.java: Handles bookings and cancellations using a HashMap.
•	Booking.java: Represents a booking with details like passenger name, flight number, ticket class, and price.
Example
1.	Booking a Ticket:
  o	Input your name.
  o	Choose a flight from the displayed list.
  o	Select a class (Economy/Business).
  o	View the ticket price and confirmation.
2.	Viewing Flights:
  o	Lists all flights with source, destination, and available seats.
3.	Canceling a Ticket:
  o	Input your name to cancel your booking.
Enhancements
Future improvements could include:
•	Integration with a database for persistent data storage.
•	A web-based UI for better usability.
•	Flight search functionality by destination or price.
•	Enhanced validation and concurrency handling.
Contact
For any questions or suggestions, feel free to reach out:
•	Email: monicaspgowda@gmail.com
•	GitHub: https://github.com/Monica2406
