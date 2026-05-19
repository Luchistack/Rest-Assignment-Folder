package africa.semicolon.noStrings.data.models;

import java.time.LocalDate;


public class Profile{

private int id;
private int seekerId;
private Seeker seeker;
private String occupation;
private String currentLocation;
private int heightICM;
private LocalDate dob;
private Complexion complexion;
private Gender gender;
private BodyType bodyType;
private String bio;




public  int getID() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public Seeker getSeeker() {
    return seeker;
}
public void setSeeker(Seeker seeker){
    this.seeker = seeker;
}

public  String getOccupation() {
    return occupation;
}

public void setOccupation(String occupation) {
    this.occupation = occupation;
}

public String getCurrentLocation() {
    return currentLocation;
}
public void setCurrentLocation(String currentLocation){
    this.currentLocation = currentLocation;
}
public LocalDate getDob() {
    return dob;
}

public void setDob(LocalDate dob) {
    this.dob = dob;
}

public void setComplexion(Complexion complexion) {
    this.complexion = complexion;
}
public Complexion getComplexion(){
    return complexion;
}
public void setGender(Gender gender) {
    this.gender = gender;
}
public Gender getGender(){
    return gender;
}
public void setBodyType(BodyType bodyType) {
    this.bodyType = bodyType;
}
public BodyType getBodyType(){
    return bodyType;
}
public String getBio(){
    return bio;
}
public void setBio(String bio){
    this.bio = bio;
}
}

