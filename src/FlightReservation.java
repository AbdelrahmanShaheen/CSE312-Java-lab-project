import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class FlightReservation {
  //data
  private String date;
  private Passenger passenger;
  private ScheduledFlight scheduledFlight;
  //constructors
  public FlightReservation(){}
  public FlightReservation(Passenger passenger ,ScheduledFlight scheduledFlight){
  //setters
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    date = LocalDateTime.now().format(myFormatObj);
    setPassenger(passenger);
    setScheduledFlight(scheduledFlight);
  }
  public void setPassenger(Passenger passenger){
    this.passenger = passenger;
  }
  public void setScheduledFlight(ScheduledFlight scheduledFlight){
    this.scheduledFlight = scheduledFlight;
  }
  public void setDate(String date){
    this.date = date;
  }
  //getters
  public String getDate(){
    return this.date;
  }
  public Passenger getPassenger(){
    return this.passenger;
  }
  public ScheduledFlight getScheduledFlight(){
    return this.scheduledFlight;
  }

  public String toString(){
    return "The passenger is :\n" + this.passenger + "\nAbout his flight:\n" + this.scheduledFlight + "\nMade this reservation at:\n" +this.date;
  }
}