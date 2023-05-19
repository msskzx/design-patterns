package de.tum.in.ase.pse;

import java.net.URL;
import java.util.Set;

public class SchoolProxy implements ConnectionInterface {

	private NetworkConnection networkConnection;
	private boolean authorized;
	private Set<String> denylistedHosts;
	private Set<Integer> teacherIDs;
	private URL redirectPage;

	public SchoolProxy(Set<String> denylistedHosts, URL redirectPage, Set<Integer> teacherIDs) {
		this.networkConnection = new NetworkConnection();
		this.authorized = false;
		this.denylistedHosts = denylistedHosts;
		this.teacherIDs = teacherIDs;
		this.redirectPage = redirectPage;
	}

	@Override
	public void connect(URL url) {
		if (!this.authorized && this.denylistedHosts.contains(url.getHost())) {
			System.err.printf("Connection to %s was rejected!%n", url.toString());
			System.out.printf("Redirecting to %s%n", this.redirectPage);
			this.connect(this.redirectPage);
		}
		this.networkConnection.connect(url);
	}

	@Override
	public void disconnect() {
		this.networkConnection.disconnect();
	}

	@Override
	public boolean isConnected() {
		return this.networkConnection.isConnected();
	}

	// DONE: Implement the SchoolProxy

	public void login(int teacherID) {
		this.authorized = this.teacherIDs.contains((Integer) teacherID);
	}

	public void logout() {
		this.authorized = false;
	}

	public NetworkConnection getNetworkConnection() {
		return networkConnection;
	}

	public void setNetworkConnection(NetworkConnection networkConnection) {
		this.networkConnection = networkConnection;
	}

	public boolean isAuthorized() {
		return authorized;
	}

	public void setAuthorized(boolean authorized) {
		this.authorized = authorized;
	}

	public Set<String> getDenylistedHosts() {
		return denylistedHosts;
	}

	public void setDenylistedHosts(Set<String> denylistedHosts) {
		this.denylistedHosts = denylistedHosts;
	}

	public Set<Integer> getTeacherIDs() {
		return teacherIDs;
	}

	public void setTeacherIDs(Set<Integer> teacherIDs) {
		this.teacherIDs = teacherIDs;
	}

	public URL getRedirectPage() {
		return redirectPage;
	}

	public void setRedirectPage(URL redirectPage) {
		this.redirectPage = redirectPage;
	}

}
