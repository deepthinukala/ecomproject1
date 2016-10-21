package com.niit.shoppingkart.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Cart implements Serializable {
 @Id
 @GeneratedValue
 
 private int id;
 private int productid;
 private int userid;
 private String productname;
 /*@Column(columnDefinition="int default 1")*/
 private int quantity;
 private double price;
 private String status;
 
 public String getStatus() {
  return status;
 }
 public void setStatus(String status) {
  this.status = status;
 }
 public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id = id;
 }
 public int getProductid() {
  return productid;
 }
 public void setProductid(int productid) {
  this.productid = productid;
 }
 public int getUserid() {
  return userid;
 }
 public void setUserid(int userid) {
  this.userid = userid;
 }
 public String getProductname() {
  return productname;
 }
 public void setProductname(String productname) {
  this.productname = productname;
 }
 public int getQuantity() {
  return quantity;
 }
 public void setQuantity(int quantity) {
  this.quantity = quantity;
 }
 public double getPrice() {
  return price;
 }
 public void setPrice(double price) {
  this.price = price;
 }
 private String cardnumber;
 private String date;
 private String cvv;
 private String method;
 private String name;

public String getCardnumber() {
	return cardnumber;
}
public String getDate() {
	return date;
}
public String getCvv() {
	return cvv;
}
public String getMethod() {
	return method;
}
public String getName() {
	return name;
}
public void setCardnumber(String cardnumber) {
	this.cardnumber = cardnumber;
}
public void setDate(String date) {
	this.date = date;
}
public void setCvv(String cvv) {
	this.cvv = cvv;
}
public void setMethod(String method) {
	this.method = method;
}
public void setName(String name) {
	this.name = name;
}
 
 

}
