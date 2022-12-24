public class Person {
  //data
  protected String name;
  protected Address address;
  //constructors
  public Person(){}
  public Person(String name ,Address address){
      setAddress(address);
      setName(name);
  }
  //setters
  public void setAddress(Address address){
    this.address = address;
  }
  public void setName(String name){
    this.name = name;
  }
  //getters
  public String getName(){
    return name;
  }  
  public Address getAddress(){
    return address;
  }
  
  public String toString(){
    return this.name + " ,his address is "+this.address;
  }
}
