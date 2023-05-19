package de.tum.in.ase.eist;

import java.time.LocalDate;
import java.time.LocalTime;

public class FixedDateTimeSlot extends TimeSlot{
	
	// Done: implement according to problem statement

	private LocalDate date;

	public FixedDateTimeSlot(LocalDate localDate, LocalTime startTime, LocalTime endTime) {
		super(startTime, endTime);
		this.setLocalDate(localDate);
	}

	public LocalDate getLocalDate() {
		return date;
	}

	public void setLocalDate(LocalDate localDate) {
		this.date = localDate;
	}
}
