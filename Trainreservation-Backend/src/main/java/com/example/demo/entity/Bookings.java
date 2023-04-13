package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="bookings")
public class Bookings {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private int passengercount;
	private String passenger1;
	private String passenger2;
	private String passenger3;
	private String passenger4;
	private int age1;
	private int age2;
	private int age3;
	private int age4;
	private String gender1;
	private String gender2;
	private String gender3;
	private String gender4;
	private String fromplace;
	private String toplace;
	private String sdate;
	public Bookings() {
		
	}
	public Bookings(Integer id, String passenger1, String passenger2, String passenger3, String passenger4,
			String fromplace, String toplace, String sdate,int age1, int age2, int age3, int age4,String gender1,String gender2,
			String gender3,String gender4,int passengercount) {
		super();
		this.id = id;
		this.passengercount=passengercount;
		this.passenger1 = passenger1;
		this.passenger2 = passenger2;
		this.passenger3 = passenger3;
		this.passenger4 = passenger4;
		this.gender1 = gender1;
		this.gender2 = gender2;
		this.gender3 = gender3;
		this.gender4 = gender4;
		this.fromplace = fromplace;
		this.toplace = toplace;
		this.sdate = sdate;
		this.age1 = age1;
		this.age2 = age2;
		this.age3 = age3;
		this.age4 = age4;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getPassengercount() {
		return passengercount;
	}
	public void setPassengercount(int passengercount) {
		this.passengercount = passengercount;
	}
	public String getPassenger1() {
		return passenger1;
	}
	public void setPassenger1(String passenger1) {
		this.passenger1 = passenger1;
	}
	public String getPassenger2() {
		return passenger2;
	}
	public void setPassenger2(String passenger2) {
		this.passenger2 = passenger2;
	}
	public String getPassenger3() {
		return passenger3;
	}
	public void setPassenger3(String passenger3) {
		this.passenger3 = passenger3;
	}
	public String getPassenger4() {
		return passenger4;
	}
	public void setPassenger4(String passenger4) {
		this.passenger4 = passenger4;
	}
	public int getAge1() {
		return age1;
	}
	public void setAge1(int age1) {
		this.age1 = age1;
	}
	public int getAge2() {
		return age2;
	}
	public void setAge2(int age2) {
		this.age2 = age2;
	}
	public int getAge3() {
		return age3;
	}
	public void setAge3(int age3) {
		this.age3 = age3;
	}
	public int getAge4() {
		return age4;
	}
	
	public String getGender1() {
		return gender1;
	}
	public void setGender1(String gender1) {
		this.gender1 = gender1;
	}
	public String getGender2() {
		return gender2;
	}
	public void setGender2(String gender2) {
		this.gender2 = gender2;
	}
	public String getGender3() {
		return gender3;
	}
	public void setGender3(String gender3) {
		this.gender3 = gender3;
	}
	public String getGender4() {
		return gender4;
	}
	public void setGender4(String gender4) {
		this.gender4 = gender4;
	}
	public void setAge4(int age4) {
		this.age4 = age4;
	}
	public String getFromplace() {
		return fromplace;
	}
	public void setFromplace(String fromplace) {
		this.fromplace = fromplace;
	}
	public String getToplace() {
		return toplace;
	}
	public void setToplace(String toplace) {
		this.toplace = toplace;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	
}
	