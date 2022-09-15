package com.hib.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Employee {
 
 
 @Id    
 @GeneratedValue(generator = "sequence-generator")    
 @GenericGenerator(name = "sequence-generator",
 strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
 parameters = {
		 @Parameter(name = "sequence_name", value = "user_sequence"),
         @Parameter(name = "initial_value", value = "4"),       
         @Parameter(name = "increment_size", value = "1")         
 })
 private int id;
 private String firstName;
 private String lastName;
 private String designation;
 private int age;
 private double salary;
 @Lob
 private String description;
 
 public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

@Temporal(TemporalType.DATE)
 private Date joiningDate;
 
 public Date getJoiningDate() {
  return joiningDate;
 }

 public void setJoiningDate(Date joiningDate) {
  this.joiningDate = joiningDate;
 }

 public int getId() {
  return id;
 }
 
 public void setId(int id) {
  this.id = id;
 }
 
 public String getFirstName() {
  return firstName;
 }
 
 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }
 
 public String getLastName() {
  return lastName;
 }
 
 public void setLastName(String lastName) {
  this.lastName = lastName;
 }
 
 public String getDesignation() {
  return designation;
 }
 
 public void setDesignation(String designation) {
  this.designation = designation;
 }
 
 public int getAge() {
  return age;
 }
 
 public void setAge(int age) {
  this.age = age;
 }
 
 public double getSalary() {
  return salary;
 }
 
 public void setSalary(double salary) {
  this.salary = salary;
 }
 
}