public class ScheduledFlight {
  //data
  private String date;
  private Flight flight;
  //constructors
  public ScheduledFlight(){}
  public ScheduledFlight(String date ,Flight flight){
    setDate(date);
    setFlight(flight);
  }
  //setters
  public void setDate(String date){
    this.date = date;
  }
  public void setFlight(Flight flight){
    this.flight = flight;
  }
  //getters
  public String getDate(){
    return this.date;
  }
  public Flight getFlight(){
    return this.flight;
  }
  public String toString(){
    return "At " + this.date + " ,There is a flight with this description :\n"+this.flight;
  }
}
