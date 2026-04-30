
public class AirCondition{ 

    private boolean isTurnedOn = false;
    private boolean temperatureIncreased = false;
    private boolean temperatureDecreased = false;
    private int temperature = 16;


    public void turnOn(){
    
        isTurnedOn = true;

} 

    public boolean isTurnedOn(){

        return isTurnedOn;

}

    public void turnOff(){
    
        isTurnedOn = false;
}
 
    public boolean isTurnedOff(){

        return isTurnedOn;

}

    public void increaseTemperature(){
    
       if(temperature < 30){
          temperature ++;
          temperatureIncreased = true;
          temperatureDecreased = false;

    }
} 
    public boolean isTemperatureIncreased(){

        return temperatureIncreased;

}

    public void decreaseTemperature(){
    
       if(temperature > 16){
          temperature --;
          temperatureDecreased = true;
          temperatureIncreased = false;
} 

}
   
     public boolean isTemperatureDecreased(){


        return temperatureDecreased;

}


    public void increaseTemperatureBeyondThirty(){
    
        while(temperature < 30){
             temperature ++;
     }  
       
} 
 
     public int checkIfTemperatureStillThirty(){

        if(temperature > 30){
             temperature = 30;
}            
 
        return temperature;

}


    public void decreaseTemperaturebelowsixteen(){
    
        if(temperature < 16){
           temperature = 16;
  }

} 
    public int isTemperaturedecreased(){

        if(temperature < 16) temperature = 16;

        return temperature;


}

}
