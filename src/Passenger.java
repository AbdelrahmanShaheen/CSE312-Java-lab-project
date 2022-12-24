public class Passenger extends Person{
  //data
  private String passportNumber;
  //constructors
  public void Passenger(){}
  public Passenger(String name ,Address address ,String passportNumber){
    super(name ,address);
    this.passportNumber = passportNumber;
  }
  //setters
  public void setPassportNumber(String passportNumber){
    this.passportNumber = passportNumber;
  }  
  //getters
  public String getPassportnumber(){
    return passportNumber;
  }
  public String toString(){
    return super.toString() + " ,and his passport number is "+this.passportNumber;
  }
}
