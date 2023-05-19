package de.tum.in.ase.eist;

import java.util.Collections;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Stream;

public final class TutorGroupStatistics {

	private TutorGroupStatistics() {

	}

	public static double averageDuration(Stream<TutorGroupMeeting> meetingStream) {
		meetingStream.mapToLong(null).average();
		return 0;
	}

	public static Set<Skill> repeatedSkills(Stream<TutorGroupMeeting> meetings) {
		return Collections.emptySet();
	}
}
