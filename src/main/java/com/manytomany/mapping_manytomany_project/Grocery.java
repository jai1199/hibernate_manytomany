package com.manytomany.mapping_manytomany_project;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Grocery 
{
	@Id
  private String gname;
  private double gprice;
  private int gid;
  @ManyToMany
  private List<Customer>customer = new ArrayList<>();
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public double getGprice() {
	return gprice;
}
public void setGprice(double gprice) {
	this.gprice = gprice;
}
public int getGid() {
	return gid;
}
public void setGid(int gid) {
	this.gid = gid;
}

public List<Customer> getCustomer() {
	return customer;
}
public void setCustomer(List<Customer> customer) {
	this.customer = customer;
}
@Override
public String toString() {
	return "Grocery [gname=" + gname + ", gprice=" + gprice + ", gid=" + gid + ", customer=" + customer + "]";
}
  
}
