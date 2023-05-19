package de.tum.in.ase.pse.controller;

import de.tum.in.ase.pse.model.Course;
import de.tum.in.ase.pse.view.CourseDetailView;
import de.tum.in.ase.pse.view.CourseListView;

public class Controller {

	private CourseListView courseListView;
	// DONE instantiate and use this CourseDetailView in selectCourse do NOT make
	// this a local variable
	private CourseDetailView courseDetailView;

	// DONE: Implement saveCourse(...). This method should add the course to the
	// list view and notify the observers
	public void saveCourse(Course course) {
		courseListView.addCourse(course);
	}

	// DONE: Implement selectCourse(...)
	public void selectCourse(Course course) {
		this.courseDetailView = new CourseDetailView(this, course);
		this.courseDetailView.show();
	}

	public void setCourseListView(CourseListView courseListView) {
		this.courseListView = courseListView;
	}

}
