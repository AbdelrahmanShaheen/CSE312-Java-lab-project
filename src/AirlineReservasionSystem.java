import java.util.ArrayList; // import the ArrayList class

public class AirlineReservasionSystem {
  //data
  private ArrayList<Airport>airports;
  private ArrayList<Flight>flights;
  private ArrayList<ScheduledFlight>schedules;
  private ArrayList<FlightReservation>reservations;
  //constructors
  public AirlineReservasionSystem(){
    this.airports = new ArrayList<Airport>();
    this.flights = new ArrayList<Flight>();
    this.schedules = new ArrayList<ScheduledFlight>();
    this.reservations = new ArrayList<FlightReservation>();
  }
  public AirlineReservasionSystem(ArrayList<Flight>flights,ArrayList<ScheduledFlight>schedules,
  ArrayList<FlightReservation>reservations ,ArrayList<Airport>airports){
    this.flights = flights;
    this.schedules = schedules;
    this.reservations = reservations;
    this.airports = airports;
  }
  //setters
  public void setAirports(ArrayList<Airport>airports){this.airports = airports;}
  public void setFlights(ArrayList<Flight>flights){this.flights = flights;}
  public void setSchedules(ArrayList<ScheduledFlight>schedules){this.schedules = schedules;}
  public void setReservations(ArrayList<FlightReservation>reservations){this.reservations = reservations;}
  //getters
  public ArrayList<Airport> getAllAirports(){
    return this.airports;
  }
  public ArrayList<Flight> getAllFlights(){
    return this.flights;
  }
  public ArrayList<ScheduledFlight> getAllScheduledFlights(){
    return this.schedules;
  }
  public ArrayList<FlightReservation> getAllReservations(){
    return this.reservations;
  }

  public void addAirport(Airport airport){
    this.airports.add(airport);
  }
  public void addFlight(Flight flight){
    flights.add(flight);
  }
  public void addScheduleFlight(ScheduledFlight scheduledFlight){
    schedules.add(scheduledFlight);
  }
  public void addFlightReservation(FlightReservation flightReservation){
    reservations.add(flightReservation);
  }
  public ScheduledFlight getScheduledFlightByFlightNumber(String flightNumber) throws Exception{
    ScheduledFlight scheduledFlight = null;
    for(ScheduledFlight scheduledFlight_ : schedules){
      String flightNum = scheduledFlight_.getFlight().getFlightNumber();
      if(flightNum.charAt(0) == flightNumber.charAt(0)) scheduledFlight = scheduledFlight_;
    }
    if(scheduledFlight == null) throw new Exception("Please enter a valid scheduled number");
  return scheduledFlight;
  }
  public FlightReservation getFlightReservationByPassport(String passportNumber) throws Exception{
    FlightReservation flightReservation = null;
    for(FlightReservation flightReservation_ : reservations){
      String passport = flightReservation_.getPassenger().getPassportnumber();
      if(passport.equals(passportNumber)){
        flightReservation = flightReservation_;
      }
    }
    if(flightReservation == null) throw new Exception("Enter a right passport number");
    return flightReservation;
  }
  public Flight getFlightByNumber(String flightNumber) throws Exception{
    Flight flight = null;
    for(Flight flight2 : flights){
      String number = flight2.getFlightNumber();
      if(number.equals(flightNumber)){
        flight = flight2;
        break;
      }
    }
    if(flight == null) throw new Exception("Please enter a valid flight number");
    return flight;
  }
  public void removeFlightReservation(FlightReservation flightReservation){
    reservations.remove(flightReservation);
  }
  public void removeScheduleFlight(ScheduledFlight scheduledFlight){
    schedules.remove(scheduledFlight);
  }
}