package de.tum.in.ase.pse;

import java.net.URL;

public class VirtualTutorGroupMeeting extends TutorGroupMeeting {

	private final URL url;

	public VirtualTutorGroupMeeting(TimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice, URL url) {
		super(timeSlot, tutorGroup, skillToPractice);
		this.url = url;
	}

	public URL getUrl() {
		return url;
	}

	public void stepOne(Student tutor) {
		tutor.say("Welcome to the virtual tutor meeting :)");
		tutor.say("Thank you for joining using " + url.toString() + " today.");
		tutor.say("Please turn on your cameras.");
	}

	public void stepTwo(Student tutor) {
		tutor.say("By the way I wanted to remind you this meeting happens regularly online on "
				+ getTimeSlot().getDayOfWeek() + " starting at " + getTimeSlot().getStartTime() + " and finishing at "
				+ getTimeSlot().getEndTime() + ", you can join it with the link " + url + ".");
	}

	public void stepThree(Student tutor) {
		tutor.say("Thank you that you have participated using the " + url + " today.");
        tutor.say("See you next time!");
	}
}
