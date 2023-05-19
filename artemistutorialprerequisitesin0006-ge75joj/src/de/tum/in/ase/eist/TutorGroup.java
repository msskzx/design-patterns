package de.tum.in.ase.eist;

import java.util.ArrayList;

public class TutorGroup {
	// Done: implement according to problem statement
	
	private String id;
	private WeeklyTimeSlot weeklyTimeSlot;
	private Person tutor;
	private ArrayList<TutorGroupMeeting> meetings;
	private ArrayList<Student> students;
	
	public TutorGroup(String id, WeeklyTimeSlot weeklyTimeSlot, Person tutor) {
		this.id = id;
		this.tutor = tutor;
	}
	
	@SuppressWarnings("unused")
	private void addMeeting(TutorGroupMeeting tutorGroupMeeting) {
		this.meetings.add(tutorGroupMeeting);
	}
	
	public void register(Student student) {
		students.add(student);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public WeeklyTimeSlot getWeeklyTimeSlot() {
		return weeklyTimeSlot;
	}

	public void setWeeklyTimeSlot(WeeklyTimeSlot weeklyTimeSlot) {
		this.weeklyTimeSlot = weeklyTimeSlot;
	}

	public Person getTutor() {
		return tutor;
	}

	public void setTutor(Person tutor) {
		this.tutor = tutor;
	}

	public ArrayList<TutorGroupMeeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(ArrayList<TutorGroupMeeting> meetings) {
		this.meetings = meetings;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
}
