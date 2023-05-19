package de.tum.in.ase.eist;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class WeeklyTimeSlot extends TimeSlot{
	
	// Done: implement according to problem statement

	private DayOfWeek dayOfWeek;

	public WeeklyTimeSlot(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
		super(startTime, endTime);
		this.dayOfWeek = dayOfWeek;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
}
