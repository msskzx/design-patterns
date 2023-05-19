package de.tum.in.ase.pse;

public class PhysicalTutorGroupMeeting extends TutorGroupMeeting {

	private final String room;

	public PhysicalTutorGroupMeeting(TimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice, String room) {
		super(timeSlot, tutorGroup, skillToPractice);
		this.room = room;
	}

	public String getRoom() {
		return room;
	}

	public void stepOne(Student tutor) {
		tutor.say("Welcome to the physical tutor meeting :)");
		tutor.say("Thank you for coming to " + room + " today.");
	}

	public void stepTwo(Student tutor) {
		tutor.say("By the way I wanted to remind you this meeting happens regularly in person on "
				+ getTimeSlot().getDayOfWeek() + " starting at " + getTimeSlot().getStartTime() + " and finishing at "
				+ getTimeSlot().getEndTime() + " in the room " + room + ".");
	}

	public void stepThree(Student tutor) {
		tutor.say("Thank you that you have participated in " + room + " today.");
		tutor.say("See you next time!");
	}
}
