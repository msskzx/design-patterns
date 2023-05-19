package de.tum.in.ase.pse;

public class PrivateTutorGroupMeeting extends TutorGroupMeeting {

	private final String address;

	public PrivateTutorGroupMeeting(TimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice, String address) {
		super(timeSlot, tutorGroup, skillToPractice);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void stepOne(Student tutor) {
		tutor.say("Welcome to the private tutor meeting :)");
		tutor.say("Thank you for coming to " + address + " today.");
		tutor.say("Please don't forget to wash your hands.");
	}

	public void stepTwo(Student tutor) {
		tutor.say("By the way I wanted to remind you this meeting happens regularly at " + address + " on "
				+ getTimeSlot().getDayOfWeek() + " starting at " + getTimeSlot().getStartTime() + " and finishing at "
				+ getTimeSlot().getEndTime() + ".");
	}

	public void stepThree(Student tutor) {
		tutor.say("Thank you that you have participated today.");
		tutor.say("See you next time at " + address + "!");
	}
}
