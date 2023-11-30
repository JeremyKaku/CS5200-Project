package game.model;
// Generated Nov 29, 2023, 4:56:05 PM by Hibernate Tools 5.4.33.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Job generated by hbm2java
 */
public class Job implements java.io.Serializable {

	private int jobId;
	private String jobName;
	private boolean availiability;
	private Set weapons = new HashSet(0);
	private Set gears = new HashSet(0);
	private Set characterJobs = new HashSet(0);

	public Job() {
	}

	public Job(int jobId, String jobName, boolean availiability) {
		this.jobId = jobId;
		this.jobName = jobName;
		this.availiability = availiability;
	}

	public Job(int jobId, String jobName, boolean availiability, Set weapons, Set gears, Set characterJobs) {
		this.jobId = jobId;
		this.jobName = jobName;
		this.availiability = availiability;
		this.weapons = weapons;
		this.gears = gears;
		this.characterJobs = characterJobs;
	}

	public int getJobId() {
		return this.jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public boolean isAvailiability() {
		return this.availiability;
	}

	public void setAvailiability(boolean availiability) {
		this.availiability = availiability;
	}

	public Set getWeapons() {
		return this.weapons;
	}

	public void setWeapons(Set weapons) {
		this.weapons = weapons;
	}

	public Set getGears() {
		return this.gears;
	}

	public void setGears(Set gears) {
		this.gears = gears;
	}

	public Set getCharacterJobs() {
		return this.characterJobs;
	}

	public void setCharacterJobs(Set characterJobs) {
		this.characterJobs = characterJobs;
	}

}
