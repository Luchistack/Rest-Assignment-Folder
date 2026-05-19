package africa.semicolon.noStrings.data.models;

import java.time.LocalDate;
public class Seeker {

    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String currentLocation;
    private int heightInCM;
    private Complexion complexion;

    public Seeker(){

    }

    public Seeker(String name, LocalDate dateOfBirth, Gender gender, String currentLocation, int heightInCM, Complexion complexion) {

            this.name = name;
            this.dateOfBirth = dateOfBirth;
            this.gender = gender;
            this.currentLocation = currentLocation;
            this.heightInCM = heightInCM;
            this.complexion = complexion;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Gender getGender(){
        return gender;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public String getCurrentLocation(){
        return currentLocation;
    }
    public void setCurrentLocation(String currentLocation){
        this.currentLocation = currentLocation;
    }
    public double getHeightInCM(){
        return heightInCM;
    }
    public void setHeightInCM(int heightInCM){
        this.heightInCM = heightInCM;
    }
    public Complexion getComplexion(){
        return complexion;
    }
    public void setComplexion(Complexion complexion){
        this.complexion = complexion;
    }

}