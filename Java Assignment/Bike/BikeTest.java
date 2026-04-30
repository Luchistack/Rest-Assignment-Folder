
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static org.testng.Assert.assertThrows;

public class BikeTest;

    @Test
    void testThatBikeIsOff(){

    Bike powerBike = new Bike();

    assertFalse(powerBike.isOn());

    }




}
