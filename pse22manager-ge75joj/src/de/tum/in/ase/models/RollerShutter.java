package de.tum.in.ase.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.Objects;

public class RollerShutter {

	private long id;

	private RollerShutterState state;

	private String room;

	private LocalDateTime lastUse;

	public RollerShutter(long id, RollerShutterState state, String room, LocalDateTime lastUse) {
		this.id = id;
		this.state = state;
		this.room = room;
		this.lastUse = lastUse;
	}

	@JsonCreator
	public RollerShutter(@JsonProperty("id") long id, @JsonProperty("state") RollerShutterState state, @JsonProperty("room") String room, @JsonProperty("lastUse") String lastUse) {
		this(id, state, room, LocalDateTime.parse(lastUse));
	}

	public RollerShutter(long id, RollerShutterState state, String room) {
		this(id, state, room, LocalDateTime.now());
	}

	public RollerShutter(long id, String room) {
		this(id, RollerShutterState.UP, room, LocalDateTime.now());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public RollerShutterState getState() {
		return state;
	}

	public void setState(RollerShutterState state) {
		this.state = state;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	@JsonIgnore
	public LocalDateTime getLastUse() {
		return lastUse;
	}

	@JsonProperty("lastUse")
	public String getLastUseAsString() {
		return getLastUse().toString();
	}

	public void setLastUse(LocalDateTime lastUse) {
		this.lastUse = lastUse;
	}

	public void setLastUse() {
		setLastUse(LocalDateTime.now());
	}

	@Override
	public String toString() {
		return "RollerShutter{" +
				"id='" + id + '\'' +
				", state='" + state + '\'' +
				", room='" + room + '\'' +
				", lastUse=" + getLastUseAsString() +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		RollerShutter rollerShutter = (RollerShutter) o;
		return getId() == rollerShutter.getId() && getState() == rollerShutter.getState() && Objects.equals(getRoom(), rollerShutter.getRoom()) && Objects.equals(getLastUse(), rollerShutter.getLastUse());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getState(), getRoom(), getLastUse());
	}
}
