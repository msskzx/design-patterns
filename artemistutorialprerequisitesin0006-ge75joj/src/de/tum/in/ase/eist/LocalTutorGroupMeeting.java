package de.tum.in.ase.eist;

public class LocalTutorGroupMeeting extends TutorGroupMeeting{

	// Done: implement according to problem statement
	
	private String room;
	
	public LocalTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice, String room) {
		super(timeSlot, tutorGroup, skillToPractice);
		this.setRoom(room);
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	@Override
	public void practice() {
		Person tutor = this.getTutorGroup().getTutor();
		tutor.say("Thank you for coming to " + this.room + " today.");
		this.studentsLearn();
		tutor.say("See you next time!");
	}
}
