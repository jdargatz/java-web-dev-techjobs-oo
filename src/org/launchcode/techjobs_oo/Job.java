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

    //Custom toString to format job parameters
    @Override
    public String toString() {
        if((this.getId() > 0) && (this.getName() != "")) {
            String emp = String.valueOf(this.getEmployer());
            String loc = String.valueOf(this.getLocation());
            String pos = String.valueOf(this.getPositionType());
            String comp = String.valueOf(this.getCoreCompetency());
            if (emp == "") {
                return "\nID: " + this.getId() +
                        "\nName: " + this.getName() +
                        "\nEmployer: Data not available." +
                        "\nLocation: " + this.getLocation() +
                        "\nPosition Type: " + this.getPositionType() +
                        "\nCore Competency: " + this.getCoreCompetency() + "\n";
            } else if (loc == "") {
                return "\nID: " + this.getId() +
                        "\nName: " + this.getName() +
                        "\nEmployer: " + this.getEmployer() +
                        "\nLocation: Data not available." +
                        "\nPosition Type: " + this.getPositionType() +
                        "\nCore Competency: " + this.getCoreCompetency() + "\n";
            } else if (pos == "") {
                return "\nID: " + this.getId() +
                        "\nName: " + this.getName() +
                        "\nEmployer: " + this.getEmployer() +
                        "\nLocation: " + this.getLocation() +
                        "\nPosition Type: Data not available." +
                        "\nCore Competency: " + this.getCoreCompetency() + "\n";
            } else if (comp == "") {
                return "\nID: " + this.getId() +
                        "\nName: " + this.getName() +
                        "\nEmployer: " + this.getEmployer() +
                        "\nLocation: " + this.getLocation() +
                        "\nPosition Type: " + this.getPositionType() +
                        "\nCore Competency: Data not available." + "\n";
            } else {
                return "\nID: " + this.getId() +
                    "\nName: " + this.getName() +
                    "\nEmployer: " + this.getEmployer() +
                    "\nLocation: " + this.getLocation() +
                    "\nPosition Type: " + this.getPositionType() +
                    "\nCore Competency: " + this.getCoreCompetency() + "\n";
            } // end nested if for if a field is blank
        } else {
            return "OOPS! This job does not seem to exist.";
        } // end if statement for if id is generated but name isn't
    } // end custom toString

    // Getters for each field EXCEPT nextId.

    public String getName() { return name; }
    public Employer getEmployer() { return employer; }
    public Location getLocation() { return location;}
    public PositionType getPositionType() { return positionType;}
    public CoreCompetency getCoreCompetency() { return coreCompetency; }
    public int getId() { return id; }

    // Setters for each field EXCEPT nextID & id.
    public void setName(String name) { this.name = name; }
    public void setEmployer(Employer employer) { this.employer = employer; }
    public void setLocation(Location location) { this.location = location; }
    public void setPositionType(PositionType positionType) { this.positionType = positionType; }
    public void setCoreCompetency(CoreCompetency coreCompetency) { this.coreCompetency = coreCompetency; }


}
