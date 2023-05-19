package de.tum.in.ase.eist;

public class VirtualTutorGroupMeeting extends TutorGroupMeeting{
	// Done: implement according to problem statement
	
	private String url;
	
	public VirtualTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skill, String url) {
		super(timeSlot, tutorGroup, skill);
		this.setUrl(url);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public void practice() {
		Person tutor = this.getTutorGroup().getTutor();
		tutor.say("Thank you for joining using " + this.url + " today.");
		this.studentsLearn();
		tutor.say("See you next time!");
	}
}
