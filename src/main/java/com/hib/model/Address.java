package com.hib.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
  private String street;
  private String city;
  private String state;
  private String PIN;
  private String country;
  
  public String getStreet() {
    return street;
  }
  
  public void setStreet(String street) {
    this.street = street;
  }
  
  public String getCity() {
    return city;
  }
  
  public void setCity(String city) {
    this.city = city;
  }
  
  public String getState() {
    return state;
  }
  
  public void setState(String state) {
    this.state = state;
  }
  
  public String getPIN() {
    return PIN;
  }
  
  public void setPIN(String pIN) {
    PIN = pIN;
  }
  
  public String getCountry() {
    return country;
  }
  
  public void setCountry(String country) {
    this.country = country;
  }
  
}