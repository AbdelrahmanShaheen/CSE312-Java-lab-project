public class Airport {
  //data
  private String name;
  private Address address;
  //constructors
  public Airport(){}
  public Airport(String name ,Address address){
    setName(name);
    setAddress(address);
  }
  //setters
  public void setName(String name){
    this.name = name;
  }
  public void setAddress(Address address){
    this.address = address;
  }
  //getters
  public String getName(){
    return name;
  }  
  public Address getAddress(){
    return address;
  }
  public String toString(){
    return this.name;
  }
}