package de.tum.in.ase.eist;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalTime;

public class TimeSlot {
	// DONE: implement according to problem statement
	
	private LocalTime startTime;
	private LocalTime endTime;
	
	public TimeSlot(LocalTime startTime, LocalTime endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public Duration getDuration() {
		return Duration.between(startTime, endTime);
	}
	
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	
	public static void main(String[] args) {
		TimeSlot x = new TimeSlot(LocalTime.of(12, 0), LocalTime.of(12, 30));
		System.out.println(x.getDuration());
	}
	
	
	
}
