package de.tum.in.ase.eist;

import java.util.ArrayList;

public abstract class TutorGroupMeeting {
	// Done: implement according to problem statement
	
	private FixedDateTimeSlot timeSlot;
	private Skill skillToPractice;
	private TutorGroup tutorGroup;
	
	public TutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice) {
		this.timeSlot = timeSlot;
		this.tutorGroup = tutorGroup;
		this.skillToPractice = skillToPractice;
	}
	
	public abstract void practice();
	
	public void studentsLearn() {
		ArrayList<Student> students = this.getTutorGroup().getStudents();
		for(Student student: students) {
			student.learnSkill(getSkillToPractce());
		}
	}
	
	public FixedDateTimeSlot getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(FixedDateTimeSlot timeSlot) {
		this.timeSlot = timeSlot;
	}

	public Skill getSkillToPractce() {
		return skillToPractice;
	}

	public void setSkillToPractce(Skill skillToPractce) {
		this.skillToPractice = skillToPractce;
	}

	public TutorGroup getTutorGroup() {
		return tutorGroup;
	}

	public void setTutorGroup(TutorGroup tutorGroup) {
		this.tutorGroup = tutorGroup;
	}

}
