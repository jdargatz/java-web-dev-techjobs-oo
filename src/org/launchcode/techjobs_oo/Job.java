package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // First constructor to initialize a unique ID
    public Job() {
        id = nextId;
        nextId++;
    }
    // Second constructor to initialize 'id' field and the rest of the fields
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer= employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // Custom equals method. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }
    // Custom hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters for each field EXCEPT nextId.

    public String getName() { return name; }
    public Employer getEmployer() { return employer; }
    public Location getLocation() { return location; }
    public PositionType getPositionType() { return positionType; }
    public CoreCompetency getCoreCompetency() { return coreCompetency; }
    public int getId() { return id; }

    // Setters for each field EXCEPT nextID & id.
    public void setName(String name) { this.name = name; }
    public void setEmployer(Employer employer) { this.employer = employer; }
    public void setLocation(Location location) { this.location = location; }
    public void setPositionType(PositionType positionType) { this.positionType = positionType; }
    public void setCoreCompetency(CoreCompetency coreCompetency) { this.coreCompetency = coreCompetency; }


}
