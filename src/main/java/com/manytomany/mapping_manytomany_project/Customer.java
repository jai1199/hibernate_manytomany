package com.manytomany.mapping_manytomany_project;

import java.util.*;

import javax.persistence.*;

@Entity
public class Customer 
{
	@Id
  private String cname;
  private int cid;
  private long phno;
  @ManyToMany(mappedBy = "customer")
  private List<Grocery>gros = new ArrayList<>();
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}

public List<Grocery> getGros() {
	return gros;
}
public void setGros(List<Grocery> gros) {
	this.gros = gros;
}
@Override
public String toString() {
	return "Customer [cname=" + cname + ", cid=" + cid + ", phno=" + phno + ", gros=" + gros + "]";
}
  
}
