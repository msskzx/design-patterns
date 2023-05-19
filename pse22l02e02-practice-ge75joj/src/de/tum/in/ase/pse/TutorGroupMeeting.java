package de.tum.in.ase.pse;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class TutorGroupMeeting {

	private static final int HOMEWORK_PRESENTATIONS_SLOTS = 3;
	private final TimeSlot timeSlot;
	private final TutorGroup tutorGroup;
	private final Skill skillToPractice;

	public TutorGroupMeeting(TimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice) {
		this.timeSlot = timeSlot;
		this.tutorGroup = tutorGroup;
		this.skillToPractice = skillToPractice;
	}

	public static int getHomeworkPresentationsSlots() {
		return HOMEWORK_PRESENTATIONS_SLOTS;
	}

	public TutorGroup getTutorGroup() {
		return tutorGroup;
	}

	public Skill getSkillToPractice() {
		return skillToPractice;
	}

	public TimeSlot getTimeSlot() {
		return timeSlot;
	}
	
	public abstract void stepOne(Student tutor);
	public abstract void stepTwo(Student tutor);
	public abstract void stepThree(Student tutor);
	
	public void practice() {
		Student tutor = getTutorGroup().getTutor();

		stepOne(tutor);
		
		tutor.say("We start with the homework presentation.");

		List<Student> homeworkPresentationCandidates = new ArrayList<>(getTutorGroup().getStudents());

		for (int i = 0; i < getHomeworkPresentationsSlots(); i++) {
			if (homeworkPresentationCandidates.isEmpty()) {
				break;
			}
			int randomIndex = ThreadLocalRandom.current().nextInt(homeworkPresentationCandidates.size());
			Student randomStudent = homeworkPresentationCandidates.get(randomIndex);
			randomStudent.presentHomework();
			homeworkPresentationCandidates.remove(randomIndex);
		}
		
		stepTwo(tutor);
		
		tutor.say("Next is the group work!");

		Skill skill = getSkillToPractice();
		skill.apply();
		for (Student student : getTutorGroup().getStudents()) {
			student.learnSkill(skill);
		}
		
		tutor.say("Let's have a look at the new homework :)");
		
		stepThree(tutor);
	}
	
}
