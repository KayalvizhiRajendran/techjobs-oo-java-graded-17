package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        String jobDetails = System.lineSeparator();
        jobDetails += "ID: "+ this.id+System.lineSeparator();
        if(this.name != null && !this.name.isEmpty()) {
            jobDetails += "Name: " + this.name + System.lineSeparator();
        }else {
            jobDetails += "Name: Data not available" + System.lineSeparator();
        }
        if(this.employer !=null && !this.employer.toString().isEmpty()){
            jobDetails += "Employer: "+ this.employer.toString()+System.lineSeparator();
        }else {
            jobDetails += "Employer: Data not available"+System.lineSeparator();
        }
        if(this.location != null && !this.location.toString().isEmpty()){
            jobDetails += "Location: "+ this.location.toString()+System.lineSeparator();
        }else{
            jobDetails += "Location: Data not available"+System.lineSeparator();
        }
        if(this.positionType != null && !this.positionType.toString().isEmpty()){
            jobDetails += "Position Type: "+ this.positionType.toString()+System.lineSeparator();
        }else{
            jobDetails += "Position Type: Data not available"+System.lineSeparator();
        }
        if(this.coreCompetency != null && !this.coreCompetency.toString().isEmpty()){
            jobDetails += "Core Competency: "+ this.coreCompetency.toString()+System.lineSeparator();
        }else{
            jobDetails += "Core Competency: Data not available"+System.lineSeparator();
        }

        return jobDetails;

    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}
