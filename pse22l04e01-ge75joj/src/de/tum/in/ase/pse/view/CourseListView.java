package de.tum.in.ase.pse.view;

import de.tum.in.ase.pse.controller.Controller;
import de.tum.in.ase.pse.model.Course;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class CourseListView extends Stage implements Observer {

	private static final int SCENE_WIDTH = 400;
	private static final int SCENE_HEIGHT = 400;
	// model
	private final ObservableList<Course> courses;
	// GUI Objects
	private final ListView<Course> courseListView;
	// controller
	private Controller controller;
	private Button createButton;

	// DONE: Update constructor
	public CourseListView(Controller controller, List<Course> courseList) {
		this.courses = FXCollections.observableArrayList(courseList);
		this.courseListView = new ListView<>(courses);
		generateUserInterface();
		
		this.controller = controller;
		controller.setCourseListView(this);
	}

	// DONE: Implement
	private void selectCourse(Course course) {
		this.controller.selectCourse(course);
	}

	// TODO: Implement
	private void createCourse() {
		this.controller.selectCourse(new Course());
	}

	// DONE: Implement addCourse()
	public void addCourse(Course course) {
		if (!courses.contains(course)) {
			courses.add(course);
			courseListView.getItems().add(course);
			course.notifyObservers();
		}
	}

	@Override
	public void update() {
		displayCourses();
	}

	private void displayCourses() {
		courseListView.refresh();
	}

	private void generateUserInterface() {
		VBox vbox = new VBox();

		createButton = new Button("Create a course");
		createButton.setOnAction(event -> createCourse());

		Label courseListLabel = new Label("Course List");
		courseListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		courseListView.setOnMouseClicked(event -> selectCourse(courseListView.getSelectionModel().getSelectedItem()));
		vbox.getChildren().addAll(courseListLabel, courseListView, createButton);

		Scene scene = new Scene(vbox, SCENE_WIDTH, SCENE_HEIGHT);
		setScene(scene);
		setTitle("Course List");
		displayCourses();
	}
}
