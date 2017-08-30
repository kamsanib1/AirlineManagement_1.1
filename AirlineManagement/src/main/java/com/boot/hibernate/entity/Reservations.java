package com.boot.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservations {

	@Id @GeneratedValue
	private int id;
	@ManyToOne
	@JoinColumn
	private Users user;
	@ManyToOne
	@JoinColumn
	private Schedules schedule;
	//@Column(name="class_type")
	private String classtype;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Schedules getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedules schedule) {
		this.schedule = schedule;
	}
	public String getClassType() {
		return classtype;
	}
	public void setClassType(String classtype) {
		this.classtype = classtype;
	}
	
	
}
