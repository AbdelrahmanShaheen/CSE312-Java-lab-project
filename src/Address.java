public class Address{
  //data
  private String city;
  private String country;
  private String zipCode;
  //constructors
  public Address(){}
  public Address(String city ,String country ,String zipCode){
    setCity(city);
    setCountry(country);
    setZipcode(zipCode);
  }
  //setters
  public void setCity(String city){this.city = city;}
  public void setCountry(String country){this.country = country;}
  public void setZipcode(String zipCode){this.zipCode = zipCode;}
  //getters
  public String getCity(){
    return city;
  }
  public String getCountry(){
    return country;
  }
  public String getZipcode(){
    return zipCode;
  }
  public String toString(){
    return this.city + " ,"+this.country+" ,(postal-code):"+this.zipCode;
  }
}