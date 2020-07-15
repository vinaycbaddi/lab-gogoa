package services;
import java.time.LocalDate;
import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

public class FareCalculator extends Booking{
	public double book(Hotel hotel) {
		int totalDays=hotel.getTodate().getDayOfMonth()-hotel.getTodate().getDayOfMonth();
		double totalFare=0;
		if(hotel.getTodate().isAfter(hotel.getFromdate())) {
			totalFare=totalDays*booking(hotel.getNoOfPersons(), hotel.getRates());
		}
		return totalFare;
	}
	public double book(Flight flight) {
		double totalFare=0;
		if(flight.getTriptype().equals("one-way"))
			totalFare = booking(flight.getNoOfPersons(),flight.getRates());
		else if(flight.getFrom().isBefore(flight.getTo()))
			totalFare = booking(flight.getNoOfPersons(),flight.getRates());
		else
			return 0;
		return totalFare;
	}
	public double book(Train train) {
		return booking(train.getNoOfPersons(), train.getRates());
	}
	public double book(Bus bus) {
		return booking(bus.getNoOfPersons(), bus.getRates());
	}

}