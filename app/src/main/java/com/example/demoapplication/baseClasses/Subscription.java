package com.example.demoapplication.baseClasses;

import java.util.List;

public class Subscription {
	private String uid;
	private List<String> events;
	
	private Subscription() {}
	
	public Subscription(String uid, List<String> events) {
		this.uid = uid;
		this.events = events;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public List<String> getEvents() {
		return events;
	}
	public void setEvents(List<String> events) {
		this.events = events;
	}
}
