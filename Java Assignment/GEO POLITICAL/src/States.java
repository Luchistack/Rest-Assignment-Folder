
public enum States {

    NORTHCENTRAL ( new String []  {"Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Plateau"}),

    NORTHEAST( new String [] {"Adamawa", "Bauchi","Borno","Gombe","Taraba","Yobe"}),

    NORTHWEST( new String [] {"Kaduna", "Katsina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"}),

    SOUTHEAST(new String [] {"Abia", "Anambra","Ebonyi","Enugu","Imo"}),

    SOUTH_SOUTH(new String [] {"AkwaIbom", "Bayelsa","CrossRiver","Delta","Edo","Rivers"}),

    SOUTHWEST( new String [] {"Ekiti", "Lagos","Osun","Ondo","Oyo"});

    private String [] states;

    States(String [] states){

        this.states = states;
    }
    public String [] getState(){
        return states;

    }

}

