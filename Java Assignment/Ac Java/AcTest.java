
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AirConditionerTest{

    @Test

    public void TestthatAcIsOnWhenTurnedOn(){

        AirCondition ac = new AirCondition();

        ac.turnOn();

        boolean actualResult = ac.isTurnedOn();
    
        assertTrue(actualResult);



}

    @Test

    public void TestthatAcIsOffWhenTurnedOff(){
 
        AirCondition ac = new AirCondition();

        ac.turnOff();

        boolean actualResult = ac.isTurnedOn();

        assertFalse(actualResult);



}


    @Test

    public void TestthatAcTemperatureIsIncreased(){
 
        AirCondition ac = new AirCondition();

        ac.increaseTemperature();

        boolean actualResult = ac.isTemperatureIncreased();


        assertTrue(actualResult);



}


    @Test

    public void TestthatAcTemperatureIsDecreased(){
 
        AirCondition ac = new AirCondition();

        ac.increaseTemperature();
        ac.decreaseTemperature();

        boolean actualResult = ac.isTemperatureDecreased();

        assertTrue(actualResult);



    }

    @Test

    public void TestAcWhenTheTemperatureIsIncreasedBeyondThirty(){
 
        AirCondition ac = new AirCondition();

        ac.increaseTemperatureBeyondThirty();

        int actualResult = ac.checkIfTemperatureStillThirty();
    
        int expectedResult = 30;


        assertEquals(expectedResult, actualResult);



    }



    @Test

    public void TestAcWhenTheTemperatureIsdecreasedBelowSixteen(){
 
        AirCondition ac = new AirCondition();

        ac.decreaseTemperaturebelowsixteen();

        int actualResult = ac.isTemperaturedecreased();
    
        int expectedResult = 16;


        assertEquals(expectedResult, actualResult);



    }

}
