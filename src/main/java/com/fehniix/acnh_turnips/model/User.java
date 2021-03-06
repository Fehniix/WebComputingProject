package com.fehniix.acnh_turnips.model;

import java.time.Instant;
import java.util.UUID;

public class User {
	private String username;
	private String uid;
	private Long timeSinceJoin;
	private String ipAddress;

	public User(String username) {
		this.username 		= username;
		this.uid 			= UUID.randomUUID().toString();
		this.timeSinceJoin 	= null;
	}

	public User(String username, String uid) {
		this.username 	= username;
		this.uid 		= uid;
	}

	public String getUsername() {
		return this.username;
	}

	public String getUID() {
		return this.uid;
	}

	public Long getTimeSinceJoin() {
		return this.timeSinceJoin;
	}

	public void setTimeSinceJoin() {
		this.timeSinceJoin = Instant.now().getEpochSecond();
	}

	public String getIPAddress() {
		return this.ipAddress;
	}

	public void setIPAddress(String ip) {
		this.ipAddress = ip;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;

		if (!(o instanceof User))
			return false;

		User u = (User) o;

		return u.getUID().equals(this.uid) && u.getUsername().equals(this.username);
	}

	@Override
	public String toString() {
		return "Username: " + this.username + " | UserID: " + this.uid + " | TimeSinceJoin: " + this.timeSinceJoin + " | IP: " + this.ipAddress;
	}
}
