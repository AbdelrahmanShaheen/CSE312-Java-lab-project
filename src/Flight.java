public class Flight {
  //data
  private String flightNumber;
  private String fromCountry;
  private String toCountry;
  private Airport arrival;
  private Airport departure;
  private int capacity;
  private FlightStatus status;
  //constructors
  public Flight(){}
  public Flight(String flightNumber ,String fromCountry ,String toCountry ,Airport arrival ,Airport departure ,int capacity ,FlightStatus status){
    setFlightNumber(flightNumber);
    setFromCountry(fromCountry);
    setToCountry(toCountry);
    setArrival(arrival);
    setDeparture(departure);
    setCapacity(capacity);
    setStatus(status);
  }
  //setters
    public void setFlightNumber(String flightNumber){
    this.flightNumber = flightNumber; 
    }
    public void setFromCountry(String fromCountry){
    this.fromCountry = fromCountry; 
    }
    public void setToCountry(String toCountry){
    this.toCountry = toCountry; 
    }
    public void setArrival(Airport airport){
    this.arrival = airport; 
    }
    public void setDeparture(Airport airport){
    this.departure = airport; 
    }
    public void setCapacity(int capacity){
    this.capacity = capacity; 
    }
    public void setStatus(FlightStatus status){
      this.status = status;
    }

  //getters
  public String getFlightNumber(){
    return flightNumber;
  }
  public String getFromCountry(){
    return fromCountry;
  }
  public String getToCountry(){
    return toCountry;
  }
  public Airport getArrival(){
    return arrival;
  }
  public Airport getDeparture(){
    return departure;
  }
  public int getCapacity(){
    return capacity;
  }
  public FlightStatus getStatus(){
    return status;
  }
  public String toString(){
    return "(Flight Num):" + this.flightNumber + " ,from "+this.fromCountry+" to "+this.toCountry + ", from airport "+this.departure + " to " +this.arrival + " (" +this.status +")";
  }
}
