package de.tum.in.ase.eist;

import java.util.HashSet;
import java.util.Set;

public class Student extends Person{
	// DONE: implement according to problem statement
	
	private String matriculationNumber;
	private int semester;
	private StudyLevel studyLevel;
	private Set<String> knowledge;
	private Set<Skill> skills;

	public Student(String name, int age, String tumId, String matriculationNumber, StudyLevel studyLevel, int semester) {
		super(name, age, tumId);
		this.matriculationNumber = matriculationNumber;
		this.studyLevel = studyLevel;
		this.semester = semester;
		this.knowledge = new HashSet<>();
		this.setSkills(new HashSet<>());
	}
	
	public void learnSkill(Skill skill) {
		this.skills.add(skill);
	}
	
	public void acquireKnowledge(String knowledge) {
		this.knowledge.add(knowledge);
	}

	public String getMatriculationNumber() {
		return matriculationNumber;
	}

	public void setMatriculationNumber(String matriculationNumber) {
		this.matriculationNumber = matriculationNumber;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public Set<String> getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(Set<String> knowledge) {
		this.knowledge = knowledge;
	}

	public StudyLevel getStudyLevel() {
		return studyLevel;
	}

	public void setStudyLevel(StudyLevel studyLevel) {
		this.studyLevel = studyLevel;
	}

	public Set<Skill> getSkills() {
		return skills;
	}

	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}
	
}
