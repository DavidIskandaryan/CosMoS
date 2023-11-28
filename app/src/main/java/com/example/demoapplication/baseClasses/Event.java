package com.example.demoapplication.baseClasses;

import com.google.firebase.database.DatabaseReference;

public class Event implements BaseClass {
	public static DatabaseReference parentRef = root.child("events").child("eventList");
	private String eventId;
	private String title;
	private String description;
	private int attendeeCount;
	private long date;

	private Event() {}

	public Event(String eventId, String title, String description, int attendeeCount, long date) {
		this.eventId = eventId;
		this.title = title;
		this.description = description;
		this.attendeeCount = attendeeCount;
		this.date = date;
	}

	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAttendeeCount() {
		return attendeeCount;
	}
	public void setAttendeeCount(int attendeeCount) {
		this.attendeeCount = attendeeCount;
	}
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(!(obj instanceof Announcement)){
			return false;
		}
		Event other = (Event)obj;
		return this.eventId.equals(other.getEventId());
	}
}
